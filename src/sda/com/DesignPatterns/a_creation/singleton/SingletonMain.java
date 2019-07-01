package sda.com.DesignPatterns.a_creation.singleton;

public class SingletonMain {
    public static void main(String[] args) {
       // Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getInstance();
        singleton.webConnection();
        System.out.println(singleton.hashCode());
        Singleton singleton2 = Singleton.getInstance();
        //Singleton singleton2 = new Singleton();
        System.out.println(singleton2.hashCode());
    }
}
