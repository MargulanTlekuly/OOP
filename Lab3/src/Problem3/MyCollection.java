package Problem3;

public interface MyCollection<E> {
    void add(E element);
    void remove(E element);
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    void clear();
}
