package Design_Patterns.Creational.Singleton;

public class Captain extends Player {
    private Captain() {
        super();
        this.ifCaptain = true;
    }
    private static class CaptainHelper{
        private static final Captain instance = new Captain();
    }
    public static Captain getInstance(){
        return CaptainHelper.instance;
    }
}
