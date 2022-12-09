package Design_Patterns.Behavioral.TemplateMethod.Order;

public class NetOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("select item from net");
    }

    @Override
    public void doPayment() {
        System.out.println("payment in net");
    }

    @Override
    public void delivery() {
        System.out.println("delivery in net");
    }
}
