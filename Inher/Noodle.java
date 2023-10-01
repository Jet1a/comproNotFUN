package Inher;

public class Noodle {
    private String name;
    private String speak = "aroy";

    public Noodle(String name){
        this.name = name;
    }

    public void receipt(){
        System.out.println("Flour: "+ name);
    }
    public void speaker(){
        System.out.println(speak);
    }
    public String getName(){
        return this.name;
    }
}
