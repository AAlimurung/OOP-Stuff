import java.lang.Math;

import static java.lang.Math.sqrt;

public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(double a, double b, String color){
        super(color);
        this.a = a;
        this.b =b;
        if(a == 0 || b == 0 ){
            throw new IllegalArgumentException("Input must be nonzero");
        }else if (a < 0 || b < 0 ){
            throw new IllegalArgumentException("Input must not be a negative number");
        }
    }


    public double area(){
        return Math.PI * a *b;
    }

    public double perimeter(){
        return Math.PI * (3*(a+b) - sqrt((a+(3*b))*(b+(3*a))));
    }

    public String toString(){
        return super.toString() + " which is also an Ellipse";
    }


    public static class Circle extends Ellipse {
        // TODO implement Circle
        private double radius;
        public Circle(double radius, String color){
            super(radius, radius, color);
            this.radius = radius;
        }

        public double area(){
            return Math.PI * Math.pow(radius, 2);
        }

        public double perimeter(){
            return Math.PI * (2 * radius);
        }
        public String toString(){
            return super.toString() + " which is also a Circle";
        }
    }
}