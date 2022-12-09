package Design_Patterns.Creational.Singleton;

import java.util.ArrayList;
import java.util.Random;

//An application that simulates cricket team
//and we need one and only one captain for a team.
public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        Random random = new Random();
        players.add(new Player("Andrio"));
        players.add(new Player("Chris"));
        players.add(new Player("Michael"));

        System.out.println("all the players:");
        for (Player player:players){
            System.out.println(player.getName());
        }

       boolean checkForCaptain = checkIfThereACaptainInTeam(players);
       if (checkForCaptain == false)
       {
           System.out.println("There is no captain in the team");
           System.out.println("making someone a captain...");
           int randomIndex = random.nextInt(players.size() - 1 - 0 + 1) + 0;
           Captain captain = Captain.getInstance();
           captain.setName(players.get(randomIndex).getName());
           players.set(randomIndex, captain);
           checkForCaptain = checkIfThereACaptainInTeam(players);
           if (checkForCaptain == false) {
               System.out.println("There is no captain in the team");
           }
           else {
               System.out.println("There is captain in the team");
               System.out.println("lets make another new captain");
               Captain captain2 = Captain.getInstance();
               if(captain == captain2)
                   System.out.println("The first captain and the second captain are the same instance");
           }

       }

    }

    private static boolean checkIfThereACaptainInTeam(ArrayList<Player> players)
    {
        for (Player player:players){
            if(player.getIfCaptain() == true)
                return true;
        }

        return false;
    }
}
