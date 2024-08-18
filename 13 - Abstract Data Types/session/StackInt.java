package session;

public interface StackInt<T> {
    void push(T t);
    T peek();
    T pop();
    int size();
}
