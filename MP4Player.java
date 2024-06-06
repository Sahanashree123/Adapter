package Adapter;
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }
}