import java.lang.Math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle extends Shape{
    private double base;
    private double height;
    private double sidea;
    private  double sidec;

    public Triangle(double base, double height, double sidea, double sidec, String color){
        super(color);
        this.base = base;
        this.height = height;
        this.sidea = sidea;
        this.sidec = sidec;

        if(base == 0 || height == 0 || sidea == 0 || sidec == 0){
            throw new IllegalArgumentException("Input must be nonzero");
        }else if (base < 0 || height < 0 || sidea < 0 || sidec < 0){
            throw new IllegalArgumentException("Input must not be a negative number");
        }
    }

    @Override
    public double area() {
        return (base*height)/2;
    }

    @Override
    public double perimeter() {
        return sidea+sidec+base;
    }

    @Override
    public String toString() {
        return super.toString() + " which is also a Triangle";
    }

    public static class EquilateralTriangle extends Triangle{
        private double side;
        public EquilateralTriangle(double side, String color){
            super(side, side, side, side, color);
            this.side = side;

            if(side == 0){
                throw new IllegalArgumentException("Input must be nonzero");
            }else if (side < 0){
                throw new IllegalArgumentException("Input must not be a negative number");
            }
        }

        @Override
        public double area() {
            return (sqrt(3) * pow(side, 2))/4 ;
        }

        @Override
        public double perimeter() {
            return 3 * side;
        }

        @Override
        public String toString() {
            return super.toString() + " which is also an Equilateral Triangle";
        }
    }
}