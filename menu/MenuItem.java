package menu;

public class MenuItem {

    private String name;
    private double price;
    private double discount;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculatePrice(double quantity) {
        return quantity*this.price;
    }
}
