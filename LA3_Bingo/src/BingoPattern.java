import java.util.ArrayList;
import java.util.List;

public abstract class BingoPattern implements Runnable {
    List<BingoChecker> checkers;
    BingoCard card;
    boolean res = false;

    public BingoPattern(BingoCard card) {
        checkers = new ArrayList<>();
        this.card = card;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        try {
            Thread[] checkingThreads = new Thread[checkers.size()];
            for(int i=0; i<checkers.size(); i++){
                checkingThreads[i] = new Thread(checkers.get(i));
                checkingThreads[i].start();
            }

            for(Thread thrd : checkingThreads){
                thrd.join();
                res = true;
            }

            if(res){
                System.out.println("Card " + card.id + " wins");
            } else {
                System.out.println("Card " + card.id + " loses");
            }
        }catch (InterruptedException e){
            System.out.println("Loses");
            Thread.currentThread().interrupt();
        }


    }
}
