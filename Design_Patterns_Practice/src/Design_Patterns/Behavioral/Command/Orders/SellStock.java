package Design_Patterns.Behavioral.Command.Orders;

import Design_Patterns.Behavioral.Command.Orders.Order;
import Design_Patterns.Behavioral.Command.Stock;

public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock){this.stock = stock;}

    @Override
    public void execute() {
        stock.sell();
    }
}
