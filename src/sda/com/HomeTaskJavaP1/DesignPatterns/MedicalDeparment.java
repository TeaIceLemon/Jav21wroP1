package sda.com.HomeTaskJavaP1.DesignPatterns;

public class MedicalDeparment extends Deparment {
    private Emergency emergency;

    public MedicalDeparment(Emergency emergency) {
        this.emergency = emergency;
        this.emergency.add(this);
    }

    @Override
    public void react(int state) {
        if (state==7){
            System.out.println("Sending one Ambulance");
        }
        else if(state ==8) System.out.println("Sending two Ambulances");
        else if(state ==9) System.out.println("Sending three Ambulances");

    }
}
