package Design_Patterns.Structural.Adaptor;

import Design_Patterns.Structural.Adaptor.AdvancedMediaPlayer.AdvancedMediaPlayer;
import Design_Patterns.Structural.Adaptor.AdvancedMediaPlayer.Mp4Player;
import Design_Patterns.Structural.Adaptor.MediaPlayer.AdvancedMediaPlayerAdapter;
import Design_Patterns.Structural.Adaptor.MediaPlayer.AudioPlayer;
import Design_Patterns.Structural.Adaptor.MediaPlayer.MediaPlayer;

//We want to make MediaPlayer play  other formats in addition to the
//AudioPlayer(mp3), like mp4.
//AdvancedMediaPlayer can play mp4 format.
//Need to build Adapter that adapts an AdvancedMediaPlayer
//to a MediaPlayer.
public class Main {

    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        AdvancedMediaPlayer advancedMediaPlayer = new Mp4Player();
        MediaPlayer adapter = new AdvancedMediaPlayerAdapter(advancedMediaPlayer);

        audioPlayer.play("mp3", "f1");
        audioPlayer.play("mp4", "f2");
        adapter.play("mp4", "f3");

    }
}
