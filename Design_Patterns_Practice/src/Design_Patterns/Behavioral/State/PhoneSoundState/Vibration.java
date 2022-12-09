package Design_Patterns.Behavioral.State.PhoneSoundState;

import Design_Patterns.Behavioral.State.PhoneSoundState.PhoneSoundState;

public class Vibration implements PhoneSoundState {
    @Override
    public void alert() {
        System.out.println("Vibration...");
    }
}
