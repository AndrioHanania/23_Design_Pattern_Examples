package Design_Patterns.Behavioral.Command;

import Design_Patterns.Behavioral.Command.Orders.BuyStock;
import Design_Patterns.Behavioral.Command.Orders.SellStock;

//We want to buy and sell stock via a broker.
public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();
        broker.takeOrder(new BuyStock(new Stock("Nike", 78)));
        broker.takeOrder(new SellStock(new Stock("Silver", 21)));
        broker.placeOrders();
    }
}
