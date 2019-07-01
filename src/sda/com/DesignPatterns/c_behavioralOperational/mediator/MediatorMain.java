package sda.com.DesignPatterns.c_behavioralOperational.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        ChatMediator wiezakontrolna = new ChatMediatorImplementation();
        User user1 = new UserImplementation(wiezakontrolna, "s1");
        User user2 = new UserImplementation(wiezakontrolna, "s2");
        User user3 = new UserImplementation(wiezakontrolna, "s3");
        User user4 = new UserImplementation(wiezakontrolna, "s4");
        User user5 = new UserImplementation(wiezakontrolna, "s5");
        wiezakontrolna.addUser(user1);
        wiezakontrolna.addUser(user2);
        wiezakontrolna.addUser(user3);
        wiezakontrolna.addUser(user4);
        wiezakontrolna.addUser(user5);
        user1.send("podchodze do lodnowania");
    }

}
