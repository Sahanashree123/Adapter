package Adapter;
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song1.mp3");
        audioPlayer.play("mp4", "video1.mp4");
        audioPlayer.play("avi", "movie.avi");  // Unsupported format
    }
}