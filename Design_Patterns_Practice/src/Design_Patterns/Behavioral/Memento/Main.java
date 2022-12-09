package Design_Patterns.Behavioral.Memento;

//An application that simulates a game with save and undo operation.
public class Main {
    public static void main(String[] args) {
        CaretakerGame caretakerGame = new CaretakerGame();
        Game game = new Game("GOD OF WAR");
        game.doAnotherMission();
        game.printProgress();
        caretakerGame.save(game);
        game.doAnotherMission();
        game.printProgress();
        caretakerGame.save(game);
        game.doAnotherMission();
        game.printProgress();

        System.out.println("do undo");
        caretakerGame.undo(game);
        game.printProgress();
        System.out.println("do undo");
        caretakerGame.undo(game);
        game.printProgress();
    }
}
