package BouquetOfFlowers;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args){
        BouquetOfFlowers weddingBouquet = new BouquetOfFlowers();

        weddingBouquet.addFlowers(new Rose("Red Rose", "Red", 5));
        weddingBouquet.addFlowers(new Rose("Violet Rose", "Violet", 7));
        weddingBouquet.addFlowers(new Chamomile("Chamomile", "White", 3));
        weddingBouquet.addFlowers(new Tulip("Yel Tulip", "Yellow", 4));
        weddingBouquet.addFlowers(new Tulip("Blue Tulip", "Blue", 6));
        weddingBouquet.addFlowers(new Aster("Reg Aster", "Pink", 8));

        PrintContent.Print(weddingBouquet.getWeddingBouquet());

        Set<Flower> sortedByName = new TreeSet<Flower>((o1, o2) -> o1.getFlowerName().compareTo(o2.getFlowerName()));
        sortedByName.addAll(weddingBouquet.getWeddingBouquet());
        System.out.println();
        System.out.println("List sorted by name: ");
        PrintContent.Print(sortedByName);

        Set<Flower> sortedByPrice = new TreeSet<Flower>((o1, o2) -> o1.getFlowerPrice() - o2.getFlowerPrice());
        sortedByPrice.addAll(weddingBouquet.getWeddingBouquet());
        System.out.println();
        System.out.println("List sorted by price: ");
        PrintContent.Print(sortedByPrice);


    }

}
