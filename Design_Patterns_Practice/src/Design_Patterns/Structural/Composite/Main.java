package Design_Patterns.Structural.Composite;

//Application that stores information for a college organization
//We want to understand the hierarchy of the faculty.
public class Main {


    public static void main(String[] args) {
        Faculty prof1 = new Professor("math prof1", "Adjunct", 500);
        Faculty prof2 = new Professor("math prof2", "Associate", 501);
        Supervisor mathSupervisor = new Supervisor("Yogev", "Math", "Chair");
        mathSupervisor.addProfessor(prof1);
        mathSupervisor.addProfessor(prof2);

        Faculty prof3 = new Professor("cs prof3", "Adjunct", 800);
        Faculty prof4 = new Professor("cs prof4", "Professor", 801);
        Faculty prof5 = new Professor("cs prof5", "Professor", 802);
        Supervisor csSupervisor = new Supervisor("Hadar", "CS", "Chair");
        csSupervisor.addProfessor(prof3);
        csSupervisor.addProfessor(prof4);
        csSupervisor.addProfessor(prof5);

        Supervisor dean = new Supervisor("Andrio", "Tech", "Dean");
        dean.addProfessor(mathSupervisor);
        dean.addProfessor(csSupervisor);

        dean.printDetails();
        System.out.println("**Removing mathSupervisor**");
        dean.removeProfessor(mathSupervisor);
        dean.printDetails();

    }
}
