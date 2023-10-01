package Inher;

public class Ramen extends Noodle {
    private String flour;
    public Ramen(String noodle,String flour) {
        super(noodle);
        this.flour = flour;
    }

    public void make(){
        System.out.println("Make");
    }
}
