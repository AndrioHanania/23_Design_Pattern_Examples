package Design_Patterns.Structural.Adaptor.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName)//just mp3-audioType
    {
        if(!audioType.equals("mp3"))
            System.out.println("** error: can not except type: " + audioType + " (just mp3) **");
        else
        System.out.println("play:: file: " + fileName + " audio type: " + audioType);
    }
}
