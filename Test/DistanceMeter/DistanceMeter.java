package DistanceMeter;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DistanceMeter {
    public static void main(String[] args) {

        Scanner DistMet = new Scanner(System.in);

        double pointX1;
        double pointY1;
        double pointX2;
        double pointY2;


        System.out.println("Distance Meter\n");
        System.out.println("This program will help you to count a distance between two dots in two dimensional coordinates\n");
        System.out.println("Please print in coordinates for X1:");

        try {

            if (DistMet.hasNextDouble()) {

                pointX1 = DistMet.nextDouble();
                System.out.println("\nPlease print in coordinates for Y1:");
                pointY1 = DistMet.nextDouble();
                System.out.println("\nPlease print in coordinates for X2:");
                pointX2 = DistMet.nextDouble();
                System.out.println("\nPlease print in coordinates for Y2:");
                pointY2 = DistMet.nextDouble();


                System.out.println("\nNow program will use formula to count the result\n");
                System.out.println("Result is: " + distCounter(pointX1, pointY1, pointX2, pointY2) + "\nCongratulations!");
            }

        }catch(InputMismatchException A){
            System.out.println("ERROR: Input has to be a number!");
        }

    }
    public static double distCounter(final double x1, final double y1, final double x2, final double y2){
        return Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
    }
}
