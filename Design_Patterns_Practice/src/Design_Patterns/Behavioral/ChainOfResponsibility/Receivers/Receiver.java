package Design_Patterns.Behavioral.ChainOfResponsibility.Receivers;

import Design_Patterns.Behavioral.ChainOfResponsibility.Message.Message;

public interface Receiver {
    public void sendNextChain(Receiver receiver);
    public boolean processMessage(Message message);
}
