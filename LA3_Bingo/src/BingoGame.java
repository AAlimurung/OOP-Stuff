import java.sql.Struct;
import java.util.*;

public class BingoGame implements Runnable {

    //initialize po TT
    boolean[] result = new boolean[76];
    boolean bingo; // make this shared
    List<BingoCard> cards = new ArrayList<>();

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many players? ");
        int playNos = sc.nextInt();

        for (int i=1; i<=playNos; i++) {
            cards.add(new BingoCard(i));
        }

        for (BingoCard c:cards) {
            System.out.println("Card: "+ c.id);
            System.out.println(c);
        }

        int smth = 0;

        while(!bingo){
            Random r = new Random();
            int aps = 0;
            while (aps < 76){
                int chosen = r.nextInt(0, 76);
                aps++;

                if(result[chosen]){
                    continue;
                }

                result[chosen] = true;
                break;
            }

//            System.out.print(chosen);

            for(int i=1; i<=75;i++){
                if(result[i]){
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            synchronized (result){
                result.notifyAll();
            }

            try{
                Thread.sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    //for no duplicates. will use later if naay duplicates ang random
    private List<Integer> randomize (int start, int end){
        List<Integer> nos = new ArrayList<>();
        for(int i=start; i<=end; i++){
            nos.add(i);
        }
        Collections.shuffle(nos);
        return nos;
    }

}
