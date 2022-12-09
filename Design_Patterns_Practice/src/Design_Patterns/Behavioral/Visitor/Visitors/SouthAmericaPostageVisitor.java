package Design_Patterns.Behavioral.Visitor.Visitors;

import Design_Patterns.Behavioral.Visitor.Elements.Book;
import Design_Patterns.Behavioral.Visitor.Elements.CD;
import Design_Patterns.Behavioral.Visitor.Elements.DVD;

public class SouthAmericaPostageVisitor implements Visitor{
    private Double total = 0.0;

    @Override
    public void visit(Book book) {
        if(book.getPrice() < 30)
            total += book.getWeight() * 2 * 2;
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice() < 30)
            total += cd.getWeight() * 2.5 * 2;
    }

    @Override
    public void visit(DVD dvd) {
        if(dvd.getPrice() < 30)
            total += dvd.getWeight() * 3 * 2;
    }

    @Override
    public Double getTotalPostage() {
        return total;
    }
}
