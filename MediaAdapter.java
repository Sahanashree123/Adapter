package Adapter;
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new MP4Player();
        } else if (audioType.equalsIgnoreCase("mp3")) {
            advancedMediaPlayer = new MP3Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMP4(filename);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            advancedMediaPlayer.playMP3(filename);
        }
    }
}