//public class BingoRowChecker extends BingoChecker implements Runnable{
//    static int row;
//
//    public BingoRowChecker(BingoCard card, int row) {
//        super(card);
//    }
//
//    @Override
//    public void run() {
//        for(int c = 0; c < 5; c++){
//            int n = card.bingo.get(c*5*row);
//            while (!BingoGame.result.wait()){
//
//            }
//        }
//    }
//}
