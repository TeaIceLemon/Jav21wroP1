package sda.com.GenericType;

public class PairMain {
    public static void main(String[] args) {
        Pair <Integer, String> intStr = new Pair<>(2,"String");
        System.out.println(intStr.getValue(2));
    }
}
