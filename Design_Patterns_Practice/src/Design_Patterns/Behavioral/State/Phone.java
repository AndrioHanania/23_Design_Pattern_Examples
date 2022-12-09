package Design_Patterns.Behavioral.State;

import Design_Patterns.Behavioral.State.PhoneSoundState.PhoneSoundState;

public class Phone { //Context
    private PhoneSoundState state;

    public Phone(PhoneSoundState state){
        this.state = state;
    }

    public void setState(PhoneSoundState state) {
        this.state = state;
    }

    public void alert(){
        state.alert();
    }
}
