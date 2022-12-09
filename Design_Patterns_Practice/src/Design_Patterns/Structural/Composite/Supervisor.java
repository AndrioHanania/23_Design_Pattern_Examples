package Design_Patterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty{ //Design_Patterns.Structural.Composite
    private String name;
    private String departmentName;
    private String type;
    private List<Faculty> professors;

    public Supervisor(String name, String departmentName, String type){
        this.name = name;
        this.departmentName = departmentName;
        this.type = type;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Faculty professor){professors.add(professor);}
    public void removeProfessor(Faculty professor){professors.remove(professor);}

    public List<Faculty> getProfessors(){return  professors;}

    @Override
    public void printDetails() {
        System.out.println(name + " is the " + type + " of the " + departmentName + " department");
        System.out.println("professors: ");
        for (Faculty faculty: professors){
            faculty.printDetails();
        }
        System.out.println();
    }
}
