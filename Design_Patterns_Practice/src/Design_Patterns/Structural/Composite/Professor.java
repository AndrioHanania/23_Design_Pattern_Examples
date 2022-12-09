package Design_Patterns.Structural.Composite;

public class Professor implements Faculty{ //Leaf
    private String name;
    private String position;
    private int officeNumber;

    public Professor(String name, String position, int officeNumber){
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public void printDetails() {
        System.out.println(name + " is the" + position + " in office: " + officeNumber);
    }
}
