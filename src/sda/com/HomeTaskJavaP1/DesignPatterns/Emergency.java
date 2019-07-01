package sda.com.HomeTaskJavaP1.DesignPatterns;

import java.util.ArrayList;
import java.util.List;
//Observer
public class Emergency {
    private List<Deparment> deparments = new ArrayList<>();
    private int state;

    public void add(Deparment dep) { deparments.add(dep); }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        callDeparment();
    }

    public void callDeparment(){
        for (Deparment dep : deparments) {
            dep.react(state);
        }
    }

}
