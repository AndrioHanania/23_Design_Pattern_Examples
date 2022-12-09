package Design_Patterns.Behavioral.Visitor.Visitors;

import Design_Patterns.Behavioral.Visitor.Elements.Book;
import Design_Patterns.Behavioral.Visitor.Elements.CD;
import Design_Patterns.Behavioral.Visitor.Elements.DVD;

public class USPostageVisitor implements Visitor{
    private Double total = 0.0;

    @Override
    public void visit(Book book) {
        if(book.getPrice() < 20)
            total += book.getWeight() * 2;
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice() < 20)
            total += cd.getWeight() * 2.5;
    }

    @Override
    public void visit(DVD dvd) {
        if(dvd.getPrice() < 20)
            total += dvd.getWeight() * 3;
    }

    @Override
    public Double getTotalPostage() {
        return total;
    }
}
