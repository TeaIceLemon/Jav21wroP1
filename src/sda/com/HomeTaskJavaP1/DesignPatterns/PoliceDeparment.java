package sda.com.HomeTaskJavaP1.DesignPatterns;

public class PoliceDeparment extends Deparment{
    private Emergency emergency;

    public PoliceDeparment(Emergency emergency) {
        this.emergency = emergency;
        this.emergency.add(this);
    }

    @Override
    public void react(int state) {
        if(state>=4 && state <=6) {
            System.out.println();
            System.out.println("Police Department:");
        }
        if (state==4){
            System.out.println("Sending one police car");
        }
        else if(state ==5) System.out.println("Sending two police car");
        else if(state ==6) System.out.println("Sending three police car");

    }
}
