package Inher;
ramen.receipt();
public class Main {
    public static void main(String[] args) {
        Noodle noodle = new Noodle("Cheese");
        Ramen ramen = new Ramen("Oat","Wheat");
        ramen.receipt();
        ramen.make();
        noodle.receipt();
    }
}
