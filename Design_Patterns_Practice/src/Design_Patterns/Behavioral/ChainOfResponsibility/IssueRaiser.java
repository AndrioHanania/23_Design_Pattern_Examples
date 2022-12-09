package Design_Patterns.Behavioral.ChainOfResponsibility;

import Design_Patterns.Behavioral.ChainOfResponsibility.Message.Message;
import Design_Patterns.Behavioral.ChainOfResponsibility.Receivers.AuthenticationErrorHandler;
import Design_Patterns.Behavioral.ChainOfResponsibility.Receivers.EmailErrorHandler;
import Design_Patterns.Behavioral.ChainOfResponsibility.Receivers.FaxErrorHandler;
import Design_Patterns.Behavioral.ChainOfResponsibility.Receivers.Receiver;

public class IssueRaiser {
    private Receiver c1;
    public IssueRaiser(){
        c1 = new FaxErrorHandler();
        Receiver c2 = new EmailErrorHandler();
        c1.sendNextChain(c2);
        c2.sendNextChain(new AuthenticationErrorHandler());
    }
    public boolean processMessage(Message message){
        return c1 != null ? c1.processMessage(message) : false;
    }
}
