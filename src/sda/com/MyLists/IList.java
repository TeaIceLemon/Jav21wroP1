package sda.com.MyLists;

public interface IList <T> {
    boolean isEmpty();
    int size();
    void add(T t);
    void add(int index,T t);
    T get(int index);
    void remove(int index);
}
