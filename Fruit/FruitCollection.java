package Fruit;

import java.util.*;

public class FruitCollection {
    private Fruit[] fruits;
    private int count;

    public FruitCollection(int size) {
        this.fruits = new Fruit[size];
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public boolean isFull() {
        if (count < fruits.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addFruit(String name, double price, int quality) {
        if (count < fruits.length) {
            fruits[count] = new Fruit(name, price, quality);
            count++;
            return true;
        } else {
            System.out.println("It full");
            return false;
        }
    }

    public Fruit getFruitAt(int slot) {
        if ((slot >= 1) && (slot <= count)) {
            return fruits[slot - 1];
        } else {
            return null;
        }
    }

    public int searchForFruitName(String name) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].getName().equals(name)) {
                return i+1;
            }
        }
        return -1;
    }
    public boolean expand(int size){
        if (size < 1) {
            return false;
        }

        Fruit[] newArrayFruits = new Fruit[size + fruits.length];
        for (int i = 0; i < fruits.length; i++) {
            newArrayFruits[i] = fruits[i];
        }
        //System.arraycopy(fruits, 0, newArrayFruits, 0, fruits.length);
        fruits = newArrayFruits;

        return true;
    }

    @Override
    public String toString() {
        return "FruitCollection{" +
                "fruits=" + Arrays.toString(fruits) +
                '}';
    }
}
