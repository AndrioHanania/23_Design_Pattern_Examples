package Design_Patterns.Behavioral.Mediator;

import Design_Patterns.Behavioral.Mediator.AuctionMediator.AuctionMediator;
import Design_Patterns.Behavioral.Mediator.AuctionMediator.AuctionMediatorIml;
import Design_Patterns.Behavioral.Mediator.Buyer.AuctionBuyer;
import Design_Patterns.Behavioral.Mediator.Buyer.Buyer;

//An application simulates an auction.
public class Main {
    public static void main(String[] args) {
        AuctionMediator mediator = new AuctionMediatorIml();
        Buyer buyer1 = new AuctionBuyer(mediator, "Tal", 10);
        Buyer buyer2 = new AuctionBuyer(mediator, "Elad", 10);
        Buyer buyer3 = new AuctionBuyer(mediator, "John", 10);
        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);
        System.out.println("Welcome to the auction. Tonight we selling the game 'GOD OF WAR'. please make some offers");
        System.out.println("Waiting for the buyer's offers...");

        buyer1.bid(100);
        buyer2.bid(200);
        buyer3.bid(300);
        mediator.printWinner();

        buyer3.unbid();
        System.out.println(buyer3.getName() + " cancel his bid. there is need to check the winner again");
        mediator.printWinner();
        mediator.finishAuction();

    }
}
