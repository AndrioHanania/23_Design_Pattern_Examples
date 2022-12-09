package Design_Patterns.Behavioral.ChainOfResponsibility.Receivers;

import Design_Patterns.Behavioral.ChainOfResponsibility.Message.Message;

public class AuthenticationErrorHandler implements Receiver {
    private Receiver chain;

    @Override
    public void sendNextChain(Receiver receiver) {
        chain = receiver;
    }

    @Override
    public boolean processMessage(Message message) {
        System.out.println("Error: type of message is not exist");
        return false;
    }
}
