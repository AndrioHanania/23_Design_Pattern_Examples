package Design_Patterns.Behavioral.Visitor;

import Design_Patterns.Behavioral.Visitor.Elements.Element;
import Design_Patterns.Behavioral.Visitor.Visitors.SouthAmericaPostageVisitor;
import Design_Patterns.Behavioral.Visitor.Visitors.USPostageVisitor;
import Design_Patterns.Behavioral.Visitor.Visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element){elements.add(element);}

    public Double totalCost(String place){
        Visitor visitor = null;
        switch (place){
            case "US":
                visitor = new USPostageVisitor();
                break;
            case "SouthAmerica":
                visitor = new SouthAmericaPostageVisitor();
                break;
            default:
                throw new IllegalArgumentException("place not supported");
        }

        for (Element element:elements){
            element.accept(visitor);
        }

        return visitor.getTotalPostage();
    }
}
