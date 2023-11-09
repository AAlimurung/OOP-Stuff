import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = null;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter shape: ");
            String option = sc.nextLine();
            switch (option) {
                case "Rectangle":
                    System.out.print("Enter length: ");
                    double len = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double wid = sc.nextDouble();
                    // This nextLine is to rid the next line made by the previous scan
                    // Do this in the future as well, before getting a String input
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String color = sc.nextLine();
                    shape = new Rectangle(len, wid, color);
                    break;
                case "Square":
                    // Add your input gathering and shape assignment here
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String scolor = sc.nextLine();
                    shape = new Rectangle.Square(side, scolor);
                    break;
                // Add other cases for other shapes here
                case "Ellipse":
                    System.out.print("Enter a: ");
                    double ea = sc.nextDouble();
                    System.out.print("Enter b: ");
                    double eb = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String ecolor = sc.nextLine();
                    shape = new Ellipse(ea, eb, ecolor);
                    break;
                case "Circle":
                    System.out.print("Enter radius: ");
                    double rad = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String ccolor = sc.nextLine();
                    shape = new Ellipse.Circle(rad, ccolor);
                    break;
                case "Triangle":
                    System.out.print("Enter base: ");
                    double ba = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double hi = sc.nextDouble();
                    System.out.print("Enter a: ");
                    double aa = sc.nextDouble();
                    System.out.print("Enter c: ");
                    double c = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String tcolor = sc.nextLine();
                    shape = new Triangle(ba, hi, aa, c, tcolor);
                    break;
                case "Equilateral Triangle":
                    // Add your input gathering and shape assignment here
                    System.out.print("Enter side: ");
                    double ss = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String eqcolor = sc.nextLine();
                    shape = new Triangle.EquilateralTriangle(ss, eqcolor);
                    break;
                default:
                    System.out.println("Unknown shape");
                    break;
            }
        }catch(IllegalArgumentException e){
            System.out.print(e.getMessage());
        }

        // This assert simply states that by the time the switch is done,
        // the shape should already be assigned to a particular shape
        // and is therefore not null anymore
       if(shape == null){
           return;
       }else{
           assert shape != null;
           System.out.println("\n" + shape);
           System.out.print("Area is ");
           System.out.format("%.2f", shape.area());
           System.out.print("\nPerimeter is ");
           System.out.format("%.2f", shape.perimeter());
       }
    }
}

//Me and my friends at the table doing shots
//Drinking fast and then we talk slow