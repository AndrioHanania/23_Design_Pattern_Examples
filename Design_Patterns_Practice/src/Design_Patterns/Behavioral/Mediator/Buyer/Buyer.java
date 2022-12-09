package Design_Patterns.Behavioral.Mediator.Buyer;

import Design_Patterns.Behavioral.Mediator.AuctionMediator.AuctionMediator;

public abstract class Buyer { //Colleague
    protected String name;
    protected double price;
    protected AuctionMediator mediator;

    public Buyer(AuctionMediator mediator, String name, double price){
        this.name = name;
        this.price = price;
        this.mediator = mediator;
    }

    public abstract void bid(double amount);
    public abstract void unbid();
    public abstract void finishAuction();

    public String getName(){return name;}

    public double getPrice() {
        return price;
    }
}
