package Design_Patterns.Structural.Flyweight.Players;

public class Terrorist implements Player {
    private String task;
    private String weapon;

    public Terrorist(String task){
        this.task = task;
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void print() {
        System.out.println("Terrorist with weapon: " + weapon
                + ", and task: " + task);
    }
}
