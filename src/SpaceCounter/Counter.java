package SpaceCounter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by DannyBoy13th on 11.03.2016.
 */
public class Counter {

    private static double sideC;
    private static double height;

    public static void main(String[] args) {

        Scanner ShapeScanner = new Scanner(System.in);
        Scanner TriangleMeter = new Scanner(System.in);
        Scanner CircleMeter = new Scanner(System.in);
        Scanner RectangleMeter = new Scanner(System.in);

        int Height;
        int sideC;
        double sideA;
        double sideB;
        double Radius;


        System.out.println("Space Counter\n");
        System.out.println("Please enter a shape which you would like to count (Triangle, Circle or Rectangle): ");
        try {

            if (ShapeScanner.hasNext("Triangle")) {

                System.out.println("Please, print in the Height of triangle");

                if (TriangleMeter.hasNextDouble()) {
                    Height = TriangleMeter.nextInt();

                    System.out.println("\nPlease, print in Side C of the triangle");
                    sideC = TriangleMeter.nextInt();

                    System.out.println("\nResult is: " + triangleCounter(sideC, Height));

                }
            }
            if (ShapeScanner.hasNext("Circle")) {
                System.out.println("Please, print in radius of the circle");

                if (CircleMeter.hasNextDouble()) {
                    Radius = CircleMeter.nextDouble();

                    System.out.println("\nResult is: " + circleCounter(Radius));
                }
            }
            if (ShapeScanner.hasNext("Rectangle")) {
                System.out.println("Please, print in Side A of the rectangle");

                if (RectangleMeter.hasNextDouble()) {
                    sideA = RectangleMeter.nextDouble();

                    System.out.println("\nPlease, print in Side B of the rectangle");
                    sideB = RectangleMeter.nextDouble();

                    System.out.println("\nResult is: " + rectangleCounter(sideA, sideB));
                }
            } else {
                throw new InputMismatchException("Wrong Shape!");
            }

        } finally {
            System.out.println("\nProgram closed");
        }

    }



    public static int triangleCounter(final int sideC, final int height){
        return (sideC * height) / 2;
    }

    private static double circleCounter(double radius){
        double Pi = 3.1412;
        return (radius * Pi);
    }
    private static double rectangleCounter(double sideA, double sideB){
        return sideA * sideB;
    }


}