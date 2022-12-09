package Design_Patterns.Behavioral.ChainOfResponsibility.Receivers;

import Design_Patterns.Behavioral.ChainOfResponsibility.Message.Message;
import Design_Patterns.Behavioral.ChainOfResponsibility.Message.MessageType;

public class EmailErrorHandler implements Receiver {
    private Receiver chain;

    @Override
    public void sendNextChain(Receiver receiver) {
        chain = receiver;
    }

    @Override
    public boolean processMessage(Message message) {
        if(message.getMessageType().equals(MessageType.EMAIL)){
            System.out.println("processing email message. text: " + message.getText());
            return true;
        }
        else if(chain != null)
            return chain.processMessage(message);
        else
            return false;
    }
}
