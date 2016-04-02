package BouquetOfFlowers;

import java.util.Collection;

public class PrintContent {
    static void Print(Collection<Flower> content){
        System.out.println("__________________________________________");
        System.out.println("Flower Price |  Flower Name   |  Flower Color");
        System.out.println("__________________________________________");

        for (Flower i : content){
            System.out.println("$"+i.getFlowerPrice() + "\t\t\t | \t" +i.getFlowerName()  + "\t\t\t|\t" + i.getFlowerColor());
        }
        System.out.println("__________________________________________");
    }
}
