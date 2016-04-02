package BouquetOfFlowers;

class Rose extends Flower {
    private String flowerName;
    private String flowerColor;
    private int flowerPrice;

    public Rose(String flowerName, String flowerColor, int flowerPrice){
        super(flowerName, flowerColor, flowerPrice);
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
        this.flowerPrice = flowerPrice;
    }

    @Override
    public String getFlowerColor() {
        return flowerColor;
    }

    @Override
    public String getFlowerName() {
        return flowerName;
    }

    @Override
    public int getFlowerPrice() {
        return flowerPrice;
    }

    @Override
    public String toString() {
        return flowerName + flowerColor + flowerPrice;
    }
}

