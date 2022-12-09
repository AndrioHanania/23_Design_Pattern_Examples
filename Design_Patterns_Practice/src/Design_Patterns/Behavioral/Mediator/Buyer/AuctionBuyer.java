package Design_Patterns.Behavioral.Mediator.Buyer;

import Design_Patterns.Behavioral.Mediator.AuctionMediator.AuctionMediator;

public class AuctionBuyer extends Buyer {
    public AuctionBuyer(AuctionMediator mediator, String name, double price) {
        super(mediator, name, price);
    }

    @Override
    public void bid(double amount) {
        this.price = amount;
    }

    @Override
    public void unbid() {
        this.price = -1;
    }

    @Override
    public void finishAuction() {
        System.out.println("user " + this.name + ": receive that the auction ended.");
    }
}
