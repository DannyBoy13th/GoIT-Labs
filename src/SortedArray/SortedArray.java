package SortedArray;
import java.util.Arrays;


/**
 * Created by DannyBoy13th on 14.03.2016.
 */
public class SortedArray {
    public static void main (String[] args){

        int[] intArray = {39, 3, 27, 4, 13, 7, 29, 35, 33, 19, 84, 14, 2255, 123, 93, 954, 41, 614, 31, 52};


        System.out.println("Below you can see our whole list of numbers in sorted order:");
        System.out.println();

        Arrays.sort(intArray);

        for (int element: intArray){
            System.out.println(element);
        }

        System.out.println();
        System.out.println("Right now, program will calculate the lowest and the highest numbers in the list");
        System.out.println();

       int low = intArray[0];
       int high = intArray[0];

        for (int i= 1; i<intArray.length; i++ ){
            if (intArray[i] > high)
                high = intArray[i];
            else if (intArray[i] < low)
                low = intArray[i];
        }

        System.out.println();
        System.out.println("Highest number:" + high);
        System.out.println();
        System.out.println("Lowest Number:" + low);



    }
}
