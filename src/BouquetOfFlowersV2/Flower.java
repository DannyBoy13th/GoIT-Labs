package BouquetOfFlowersV2;

abstract class Flower{
    private String flowerName;
    private String flowerColor;
    private int flowerPrice;

    public Flower(String flowerName, String flowerColor, int flowerPrice){
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
        this.flowerPrice = flowerPrice;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getFlowerPrice() {
        return flowerPrice;
    }

    public abstract String toString();
}
