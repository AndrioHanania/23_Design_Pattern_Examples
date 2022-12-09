package Design_Patterns.Structural.Adaptor.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    String file;
    @Override
    public void loadFileName(String fileName) {
        this.file = fileName;
    }

    @Override
    public void listen() {
        System.out.println("play file: " + this.file + " audio type: mp4");
    }
}
