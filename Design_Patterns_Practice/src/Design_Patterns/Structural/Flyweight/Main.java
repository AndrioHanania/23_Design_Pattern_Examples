package Design_Patterns.Structural.Flyweight;

import Design_Patterns.Structural.Flyweight.Players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    //simple game: 1 terrorist against 1 counter-terrorist
    //and they can change their weapons.

    public static void main(String[] args) {
        PlayerFactory factory = new PlayerFactory();
        Player terrorist = null;
        for (int i = 0;i < 3;i++){
            terrorist = factory.getPlayer("Terrorist", "Plant a bomb");
            terrorist.setWeapon(getRandomWeapon());
            terrorist.print();
        }

        Player counterTerrorist = null;
        for (int i = 0;i < 3;i++){
            counterTerrorist = factory.getPlayer("CounterTerrorist", "diffuse bomb");
            counterTerrorist.setWeapon(getRandomWeapon());
            counterTerrorist.print();
        }

        System.out.println("number of players:" + factory.getNumOfPlayers());
    }

    private static String getRandomWeapon(){
        List<String> optionalWeapons = new ArrayList<>();
        optionalWeapons.add("Knife");
        optionalWeapons.add("AK-47");
        optionalWeapons.add("Glock");
        optionalWeapons.add("Bazooka");
        Random random = new Random();
        int randomWeapon = random.nextInt(4);
        return optionalWeapons.get(randomWeapon);
    }
}
