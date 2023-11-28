package kopibiiin;

public class Main {
    public static void main(String[] args) {
        Coffee brewed = new Coffee(8, "Coffee");
        Coffee instant = new Coffee(8, "Instant");
        Coffee esp = new Coffee(1, "Espresso");
        Tea tea = new Tea(8, 47, "Brewed black");
        Soda rb = new Soda(8, 0, "Root Beer");
        Soda c = new Soda(8, 22, "Cola");

        //call to print the serving sizes
        //call to print the caffeine levels
    }
}
