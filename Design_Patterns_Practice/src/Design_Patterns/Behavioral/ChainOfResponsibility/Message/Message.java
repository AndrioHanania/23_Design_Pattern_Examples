package Design_Patterns.Behavioral.ChainOfResponsibility.Message;

public class Message {
    private String text;
    private MessageType messageType;

    public Message(String text, MessageType messagePriority){
        this.text = text;
        this.messageType = messagePriority;
    }

    public MessageType getMessageType() {
        return messageType;
    }
    public String getText() {
        return text;
    }
}
