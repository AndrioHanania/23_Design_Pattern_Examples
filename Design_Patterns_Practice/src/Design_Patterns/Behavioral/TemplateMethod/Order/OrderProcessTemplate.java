package Design_Patterns.Behavioral.TemplateMethod.Order;

public abstract class OrderProcessTemplate {
    public final void processOrder(boolean isGift){
        doSelect();
        if(isGift)
            giftWrapping();
        doPayment();
        delivery();
    }

    public abstract void doSelect();
    public abstract void doPayment();
    public abstract void delivery();

    public void giftWrapping(){
        System.out.println("default gift wrapping");
    }
}
