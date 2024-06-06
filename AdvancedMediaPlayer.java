package Adapter;
public interface AdvancedMediaPlayer {
    default void playMP4(String filename){}
    default void playMP3(String filename){}
}