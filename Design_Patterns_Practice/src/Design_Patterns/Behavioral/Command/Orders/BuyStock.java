package Design_Patterns.Behavioral.Command.Orders;

import Design_Patterns.Behavioral.Command.Stock;

public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock){this.stock = stock;}

    @Override
    public void execute() {
        stock.buy();
    }
}
