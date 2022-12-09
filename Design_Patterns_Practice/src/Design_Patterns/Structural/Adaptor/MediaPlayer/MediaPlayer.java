package Design_Patterns.Structural.Adaptor.MediaPlayer;

public interface MediaPlayer { //Target
    //we want to make MediaPlayer play other format in
    //addition to AudioPlayer(mp3)
    public void play(String audioType, String fileName);
}
