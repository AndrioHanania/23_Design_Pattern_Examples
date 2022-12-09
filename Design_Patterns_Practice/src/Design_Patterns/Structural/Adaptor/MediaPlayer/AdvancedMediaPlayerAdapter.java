package Design_Patterns.Structural.Adaptor.MediaPlayer;

import Design_Patterns.Structural.Adaptor.AdvancedMediaPlayer.AdvancedMediaPlayer;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;
    public AdvancedMediaPlayerAdapter(
            AdvancedMediaPlayer advancedMediaPlayer)
    {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp4") || audioType.equals("vlc"))//not necessary
        {
            advancedMediaPlayer.loadFileName(fileName);
            advancedMediaPlayer.listen();
        }
        else
        {
            System.out.println("** error: can not except type: " + audioType + " just mp4 or vlc **");
        }
    }
}
