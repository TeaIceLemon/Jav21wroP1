package sda.com.DesignPatterns.b_structural.adapter;



public class AdapterMain {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "Sławomir - Miłość w Zakopanem.mp3");
        player.play("vlc", "Deadpool 2.vlc");
        player.play("mp4", "Frozen.mp4");
        player.play("avi", "Urodziny krzycha.avi");
    }
}
