package Fruit;

public class FruitMain {
    public static void main(String[] args) {
        Fruit a = new Fruit("Apple", 150.9, 10);
        Fruit b = new Fruit("Banana", 48.52, 6);
        System.out.println(a);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));

        System.out.println("");

        FruitCollection fc = new FruitCollection(2);

        fc.addFruit("Cherry", 85.179, 8);
        fc.addFruit("Date", 94.62, 9);
        System.out.println(fc);
        fc.expand(3);
        fc.addFruit("Kiwi", 64.93, 7);
        System.out.println(fc);
        int s = fc.searchForFruitName("Kiwi");
        System.out.println(s);
        if (s>=0) {
            System.out.println(fc.getFruitAt(s));
        }
    }
}
