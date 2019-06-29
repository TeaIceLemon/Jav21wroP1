package sda.com.DesignPatterns.b_structural.adapter;

public class AdvancedPlayer implements AdvancedMediaPlater {
    //not compatible with S.O.L.I.D


    @Override
    public void playVlc(String name) {
        System.out.println("Playing Vlc format, named: " + name);
    }

    @Override
    public void playMp4(String name) {
        System.out.println("Playing mp4 format , named: " + name);
    }
}
