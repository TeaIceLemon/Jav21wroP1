package sda.com.DesignPatterns.c_behavioralOperational.mediator;

public abstract class User {
    ChatMediator mediator;
    String name;

    User(ChatMediator med, String name){
        this.mediator = med;
        this.name=name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
