public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;

        if(length == 0 || width == 0){
            throw new IllegalArgumentException("Input must be nonzero");
        }else if (length < 0 || width < 0){
            throw new IllegalArgumentException("Input must not be a negative number");
        }
    }

//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        setLength(length);
//        if(length == 0){
//            throw new IllegalArgumentException("Input must be nonzero");
//        }else if (length < 0){
//            throw new IllegalArgumentException("Input must not be a negative number");
//        }
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        setWidth(width);
//        if( width == 0){
//            throw new IllegalArgumentException("Input must be nonzero");
//        }else if (width < 0){
//            throw new IllegalArgumentException("Input must not be a negative number");
//        }
//        this.width = width;
//    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + " which is also a Rectangle";
    }

//Come over and start up a conversation with just me
//And trust me I'll give it a chance now

    public static class Square extends Rectangle {

        public Square(double side, String color) {
            // TODO call super()
            super(side, side, color);
            if(side == 0){
                throw new IllegalArgumentException("Input must be nonzero");
            }else if (side < 0){
                throw new IllegalArgumentException("Input must not be a negative number");
            }

        }

        public String toString() {
            return super.toString() + " which is also a Square";
        }
    }
}

//The club isn't the best place to find a lover
//so the bar is where I go