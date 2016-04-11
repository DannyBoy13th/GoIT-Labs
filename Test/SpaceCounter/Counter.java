package SpaceCounter;

import java.util.Scanner;

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
        int sideA;
        int sideB;
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

                if (RectangleMeter.hasNextInt()) {
                    sideA = RectangleMeter.nextInt();

                    System.out.println("\nPlease, print in Side B of the rectangle");
                    sideB = RectangleMeter.nextInt();

                    System.out.println("\nResult is: " + rectangleCounter(sideA, sideB));
                }
            }
        } finally {
            System.out.println("\nProgram closed");
        }

    }



    public static int triangleCounter(final int sideC, final int height){
        return (sideC * height) / 2;
    }

    public static double circleCounter(final double radius){
        return ((radius*radius) * Math.PI);
    }
    public static int rectangleCounter(final int sideA, final int sideB){
        return sideA * sideB;
    }


}