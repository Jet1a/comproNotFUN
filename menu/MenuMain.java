package menu;
import java.util.*;
public class MenuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuItem burger = new MenuItem("Burger",4.99);
        MenuItem pizza = new MenuItem("Pizza",5.99);
        MenuItem salad = new MenuItem("Salad",4.99);

        double sum = 0;

        System.out.println("Menu");
        System.out.println("1.Burger 4.99$");
        System.out.println("2.Pizza 6.99$");
        System.out.println("3.Salad 4.99$");

        System.out.println("--------------------------------------");

        System.out.print("Select item number : ");
        int item = sc.nextInt();

        System.out.print("Enter quantity : ");
        int quantity = sc.nextInt();

        switch (item){
            case 1:
                sum = burger.calculatePrice(quantity);
                break;
            case 2:
                sum = pizza.calculatePrice(quantity);
                break;
            case 3:
                sum = salad.calculatePrice(quantity);
                break;
            default:
        }
        System.out.print("Using discount? (Y/N) : ");
        String choice = sc.next();
        if(choice.equals("Y")){
            System.out.println(sum*0.9);
        }else{
            System.out.println(sum);
        }
    }
}
