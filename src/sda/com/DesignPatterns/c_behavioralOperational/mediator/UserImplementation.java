package sda.com.DesignPatterns.c_behavioralOperational.mediator;

public class UserImplementation extends User {
    UserImplementation(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " sending msg " + msg );
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " receiving msg " + msg);

    }
}
