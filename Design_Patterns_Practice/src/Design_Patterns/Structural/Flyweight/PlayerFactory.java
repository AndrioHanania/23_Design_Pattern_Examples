package Design_Patterns.Structural.Flyweight;

import Design_Patterns.Structural.Flyweight.Players.CounterTerrorist;
import Design_Patterns.Structural.Flyweight.Players.Player;
import Design_Patterns.Structural.Flyweight.Players.Terrorist;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private Map<String, Player> playersMap = new HashMap<>();

    public Player getPlayer(String playerType, String task){
        Player myPlayer = null;
        if(playersMap.containsKey(playerType))
            myPlayer =  playersMap.get(playerType);
        else {
            switch (playerType){
                case "Terrorist":
                    System.out.println("There isn't Terrorist. Creating one...");
                    myPlayer =  new Terrorist(task);
                    break;
                case "CounterTerrorist":
                    System.out.println("There isn't CounterTerrorist. Creating one...");
                    myPlayer =  new CounterTerrorist(task);
                    break;
                default:
                    throw new IllegalArgumentException("There is no " + playerType + " type of player");
            }
            playersMap.put(playerType, myPlayer);
        }
        return myPlayer;
    }

    public int getNumOfPlayers(){return playersMap.size();}
}
