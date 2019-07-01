package sda.com.HomeTaskJavaP1.DesignPatterns;

public class Dispacher {
    Emergency emergency;
    public void confirmEmergency(int state){
        System.out.println("I got your message ");
        System.out.println("Sending help");
        emergency.setState(state);
    }

}
