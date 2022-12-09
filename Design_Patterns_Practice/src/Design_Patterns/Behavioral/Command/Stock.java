package Design_Patterns.Behavioral.Command;

public class Stock { //Receiver
    private String name;
    private double quantity;

    public Stock(String name, double quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("buying stock: " + name
        + ", in quantity: " + quantity);
    }
    public void sell(){
        System.out.println("selling stock: " + name
                + ", in quantity: " + quantity);
    }
}
