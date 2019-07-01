package sda.com.DesignPatterns.a_creation.singleton;

public class Singleton {
    //przypadek lazy
    private static Singleton instance = null;
    private Singleton(){
        //po to by nie inicjalizowac na poczatku
    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void webConnection(){
        System.out.println("Connected to internet");
    }
}

