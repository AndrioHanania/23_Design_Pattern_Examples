package Design_Patterns.Behavioral.Mediator.AuctionMediator;

import Design_Patterns.Behavioral.Mediator.Buyer.Buyer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AuctionMediatorIml implements AuctionMediator {
    private List<Buyer> buyers;

    public AuctionMediatorIml(){
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.getName() + " added to the list");
    }

    @Override
    public void printWinner() {
        Buyer winner = buyers.stream().max(Comparator.comparingDouble(b -> b.getPrice())).get();
        System.out.println("The winner is: " +  winner.getName() + " and he paid: " + winner.getPrice());
    }

    @Override
    public void finishAuction() {
        for (Buyer buyer:buyers)
            buyer.finishAuction();
    }
}
