package Design_Patterns.Behavioral.Visitor.Elements;

import Design_Patterns.Behavioral.Visitor.Visitors.Visitor;

public interface Element {
    public void accept(Visitor visitor);
}
