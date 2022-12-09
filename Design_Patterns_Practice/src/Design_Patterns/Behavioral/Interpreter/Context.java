package Design_Patterns.Behavioral.Interpreter;

public class Context {
    private String input;

    public Context(String input){
        this.input = input;
    }
    public boolean getResult(String data){
        return input.contains(data);
    }
}
