package Design_Patterns.Behavioral.TemplateMethod.Order;

import Design_Patterns.Behavioral.TemplateMethod.Order.OrderProcessTemplate;

public class StoreOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("select item from Store");
    }

    @Override
    public void doPayment() {
        System.out.println("payment in Store");
    }

    @Override
    public void delivery() {
        System.out.println("delivery in Store");
    }
}
