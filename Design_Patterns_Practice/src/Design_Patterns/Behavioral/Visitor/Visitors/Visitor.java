package Design_Patterns.Behavioral.Visitor.Visitors;

import Design_Patterns.Behavioral.Visitor.Elements.Book;
import Design_Patterns.Behavioral.Visitor.Elements.CD;
import Design_Patterns.Behavioral.Visitor.Elements.DVD;

public interface Visitor {
    public void visit(Book book);
    public void visit(CD cd);
    public void visit(DVD dvd);
    public Double getTotalPostage();
}
