package Design_Patterns.Behavioral.ChainOfResponsibility;

import Design_Patterns.Behavioral.ChainOfResponsibility.Message.Message;
import Design_Patterns.Behavioral.ChainOfResponsibility.Message.MessageType;

//We try to handle email or fax errors.
public class Main {
    public static void main(String[] args) {
        IssueRaiser issueRaiser = new IssueRaiser();
        issueRaiser.processMessage(new Message("this is text message to fax", MessageType.FAX));
        issueRaiser.processMessage(new Message("this is text message to email", MessageType.EMAIL));
        issueRaiser.processMessage(new Message("this is text message to fax", MessageType.NONE));
    }
}
