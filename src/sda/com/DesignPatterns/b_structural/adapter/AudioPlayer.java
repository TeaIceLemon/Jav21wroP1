package sda.com.DesignPatterns.b_structural.adapter;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String name) {

        //default player
        if(type.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 format, named " + name);
        }
        //advanced player for everything else
        else if (type.equalsIgnoreCase("vlc")
            || type.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(type, name);
        }
        else {
            System.out.println("Wrong format " + type);
            System.out.println("Cant play this format");
        }
    }
}
