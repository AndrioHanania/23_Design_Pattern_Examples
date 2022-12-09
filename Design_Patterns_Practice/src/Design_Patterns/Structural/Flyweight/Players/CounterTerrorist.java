package Design_Patterns.Structural.Flyweight.Players;

public class CounterTerrorist implements Player {
    private String task;
    private String weapon;

    public CounterTerrorist(String task){
        this.task = task;
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void print() {
        System.out.println("CounterTerrorist with weapon: " + weapon
                + ", and task: " + task);
    }
}
