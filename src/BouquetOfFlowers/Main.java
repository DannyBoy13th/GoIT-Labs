package com.goit.BouquetOfFlowers;


/**
 * Created by Daniel Solo on 09.03.2016.
 */
public class Main {
    public static void main(String [] args){;
        Flower RegularFlower=new Flower();
        Chamomile Chamomile=new Chamomile();
        Aster Aster=new Aster();
        Tulip Tulip=new Tulip();
        Rose Rose=new Rose();
        Rosebush Rosebush=new Rosebush();
        BouquetOfFlowers Wedding=new BouquetOfFlowers();

        Wedding.Bouquet();
        System.out.println();

        System.out.println("Detailed Contents:");
        System.out.println("Chamomile");
        Chamomile.Color();
        Chamomile.Price();
        Chamomile.Quantity();
        System.out.println();

        System.out.println("Aster");
        Aster.Color();
        Aster.Price();
        Aster.Quantity();
        System.out.println();

        System.out.println("Rose");
        Tulip.Color();
        Tulip.Price();
        Tulip.Quantity();
        System.out.println();

        Rosebush.Bush();
    }
}
