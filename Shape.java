// WARNING: Do not modify this code.

import java.util.InputMismatchException;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

//    public Shape() throws InputMismatchException {
//        System.out.println("Unknown shape");
//    }
    @Override
    public String toString() {
        return "A shape that is color " + color;
    }

    public abstract double area();
    public abstract double perimeter();
}