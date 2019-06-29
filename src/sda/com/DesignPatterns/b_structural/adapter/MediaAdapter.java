package sda.com.DesignPatterns.b_structural.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlater advancedMediaPlater;

    public MediaAdapter(){
        advancedMediaPlater = new AdvancedPlayer();
        }


    @Override
    public void play(String type, String name) {
        if(type.equalsIgnoreCase("vlc")){
            advancedMediaPlater.playVlc(name);
        }else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlater.playMp4(name);
        }

    }
}
