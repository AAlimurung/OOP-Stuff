public class Main {
    public static void main(String[] args) {
        Thread apple = new Thread(new BingoGame());
        apple.start();
    }
}