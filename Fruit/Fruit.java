package Fruit;

public class Fruit {
    private String name;
    private double price;
    private int quality;

    public Fruit(String name, double price, int quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    public boolean equals(Fruit f){
        return this == f;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                '}';
    }

    public int compareTo(Fruit f){
        if(this.getQuality() > f.getQuality()){
            return 1;
        }else if(this.getQuality() < f.getQuality()){
            return -1;
        }else{
            return  0;
        }
    }
}
