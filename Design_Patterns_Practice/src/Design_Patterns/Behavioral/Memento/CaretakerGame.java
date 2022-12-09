package Design_Patterns.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CaretakerGame {
    private List<Object> saves;

    public CaretakerGame(){
        saves = new ArrayList<>();
    }

    public void save(Game game){
        saves.add(game.save());
    }

    public void undo(Game game){
        if(saves.size() >= 1)
        {
            game.undoSave(saves.get(saves.size() - 1));
            saves.remove(saves.size() - 1);
        }
    }

}
