package Design_Patterns.Behavioral.State;

import Design_Patterns.Behavioral.State.PhoneSoundState.Silent;
import Design_Patterns.Behavioral.State.PhoneSoundState.Vibration;

//An application simulates alerts of a mobile phone.
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(new Vibration());
        phone.alert();
        phone.setState(new Silent());
        phone.alert();

    }
}
