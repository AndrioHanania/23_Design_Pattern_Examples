package Design_Patterns.Creational.Singleton;

public class Player {
    protected String name;
    protected boolean ifCaptain = false;

    public Player(String name){this.name = name;}
    public Player(){}

    public String getName(){return name;}
    public boolean getIfCaptain(){return  ifCaptain;}
    public void setName(String name) {
        this.name = name;
    }
    public void setIfCaptain(boolean ifCaptain) {
        this.ifCaptain = ifCaptain;
    }
}
