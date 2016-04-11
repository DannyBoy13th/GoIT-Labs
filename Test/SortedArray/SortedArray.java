package SortedArray;
import java.util.Arrays;

public class SortedArray {
    public static void main (String[] args){

        int[] intArray = {39, 3, 27, 4, 13, 7, 29, 35, 33, 19, 84, 14, 2255, 123, 93, 954, 41, 614, 31, 52};


        System.out.println("Below you can see our whole list of numbers in sorted order:\n");

        Arrays.sort(intArray);

        for (int element: intArray){
            System.out.println(element);
        }

        System.out.println("\nRight now, program will calculate the lowest and the highest numbers in the list\n");

        System.out.println("Highest number:" + maximum(intArray));
        System.out.println("\nLowest Number:" + minimum(intArray));

    }

        public static int minimum(final int Array[]) {
        int minVariable = Array[0];

        for (int count = 0; count < (Array.length - 1); count++) {

            if (minVariable > Array[count + 1]) {
                minVariable = Array[count + 1];
            }
        }
        return minVariable;
    }

    public static int maximum(final int Array[]) {
        int maxVarible = Array[0];

        for (int count = 0; count < (Array.length - 1); count++) {

            if (maxVarible < Array[count + 1]) {
                maxVarible = Array[count + 1];
            }
        }
        return maxVarible;
 }
}
