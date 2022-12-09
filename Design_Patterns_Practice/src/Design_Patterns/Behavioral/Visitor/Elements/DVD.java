package Design_Patterns.Behavioral.Visitor.Elements;

import Design_Patterns.Behavioral.Visitor.Visitors.Visitor;

public class DVD implements Element {
    private Double weight;
    private Double price;
    public DVD(Double weight, Double price){
        this.weight = weight;
        this.price = price;
    }
    public Double getPrice() {return price;}
    public Double getWeight() {return weight;}

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}