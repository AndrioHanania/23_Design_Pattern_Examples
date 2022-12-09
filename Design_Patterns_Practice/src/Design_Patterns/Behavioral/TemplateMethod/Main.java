package Design_Patterns.Behavioral.TemplateMethod;

import Design_Patterns.Behavioral.TemplateMethod.Order.NetOrder;
import Design_Patterns.Behavioral.TemplateMethod.Order.OrderProcessTemplate;
import Design_Patterns.Behavioral.TemplateMethod.Order.StoreOrder;

//An application that allows clients to order items and process
//them by paying online or physically.
public class Main {
    public static void main(String[] args) {
        //assume we added items to shopping cart
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(false);
        System.out.println("\n***************\n");
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
