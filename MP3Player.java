package Adapter;
public class MP3Player implements AdvancedMediaPlayer {

    @Override
    public void playMP3(String filename) {
        System.out.println("Playing MP3 file: " + filename);
    }
}