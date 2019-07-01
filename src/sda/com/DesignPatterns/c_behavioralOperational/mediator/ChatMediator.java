package sda.com.DesignPatterns.c_behavioralOperational.mediator;

public interface ChatMediator {
    void addUser(User user);
    void sendMessage(String msg, User user);


}
