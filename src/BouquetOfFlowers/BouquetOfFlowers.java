package BouquetOfFlowers;


import java.util.ArrayList;

public class BouquetOfFlowers {
    ArrayList<Flower> weddingBouquet = new ArrayList<>();
    public void addFlowers (Flower flower){
        weddingBouquet.add(flower);
    }
    public ArrayList<Flower> getWeddingBouquet(){
        return weddingBouquet;
    }
}
