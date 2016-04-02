package BouquetOfFlowers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Rosebush {
    public String Name = "Rosebush";
    public String Bush="Green Bush covered in many wild roses";
    public String Ros="Approximately 43 roses can be found on this bush";

   private List Roses = Arrays.asList(Ros);



    Iterator itr=Roses.iterator();

    public void Bush(){
        System.out.println(Bush);
        while(itr.hasNext())

            System.out.println(itr.next());

    }
}

