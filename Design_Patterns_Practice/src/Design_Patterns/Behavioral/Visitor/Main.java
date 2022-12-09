package Design_Patterns.Behavioral.Visitor;

import Design_Patterns.Behavioral.Visitor.Elements.Book;
import Design_Patterns.Behavioral.Visitor.Elements.CD;
import Design_Patterns.Behavioral.Visitor.Elements.DVD;

//An application that simulates shopping cart.
//We will calculate the cost of postage for shipping items
public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Book(1.04, 14.5));
        shoppingCart.add(new CD(2.25, 12.0));
        shoppingCart.add(new DVD(0.95, 15.99));

        System.out.println("total postage in US: " +  shoppingCart.totalCost("US"));
        System.out.println("total postage in SouthAmerica: " +  shoppingCart.totalCost("SouthAmerica"));
    }
}
