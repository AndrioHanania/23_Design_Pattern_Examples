package Design_Patterns.Behavioral.Mediator.AuctionMediator;

import Design_Patterns.Behavioral.Mediator.Buyer.Buyer;

public interface AuctionMediator {
    public void addBuyer(Buyer buyer);
    public void printWinner();
    public void finishAuction();
}
