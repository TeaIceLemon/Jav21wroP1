package sda.com.HomeTaskJavaP1.DesignPatterns;

public class FireDeparment extends Deparment {
    private Emergency emergency;

    public FireDeparment(Emergency emergency) {
        this.emergency = emergency;
        this.emergency.add(this);
    }

    @Override
    public void react(int state) {
        if (state==1){
            System.out.println("Sending one fireTruck");
        }
        else if(state ==2) System.out.println("Sending two tracks");
        else if(state ==3) System.out.println("Sending three trucks");
    }
}
