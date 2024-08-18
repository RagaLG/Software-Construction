package session;

public interface Heap {
    void add(int value);
    int remove();
    int size();
    int[] toArray();
}
