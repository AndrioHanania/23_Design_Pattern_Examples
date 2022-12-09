package Design_Patterns.Behavioral.Memento;

public class Game { //Originator
    private String name;
    private int currNumMission;

    public Game(String name){
        this.name = name;
        currNumMission = 0;
    }

    public Game(String name, int currNumMission){
        this.name = name;
        this.currNumMission = currNumMission;
    }

    public void printProgress(){
        System.out.println("current number mission: " + currNumMission);
    }

    public void doAnotherMission(){
        currNumMission++;
    }

    public MementoGame save(){
        return new MementoGame(name, currNumMission);
    }

    public void undoSave(Object obj){
        MementoGame memento = (MementoGame) obj;
        this.name = memento.name;
        this.currNumMission = memento.currNumMission;
    }

    private class MementoGame{
        private String name;
        private int currNumMission;

        public MementoGame(String name, int currNumMission){
            this.name = name;
            this.currNumMission = currNumMission;
        }
    }
}
