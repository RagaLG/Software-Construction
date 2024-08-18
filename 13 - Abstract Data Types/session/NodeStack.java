package session;

import java.util.ArrayList;

public class NodeStack <T> implements StackInt<T>{
    T top = null;
    ArrayList <T> stack = new ArrayList<T>();

    @Override
    public void push(T input){
        stack.add(input);
        top = input;
    }

    @Override
    public T pop(){
        T temp = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return temp;
    }

    @Override
    public T peek(){
        return stack.get(stack.size()-1);
    }

    @Override
    public int size(){
        return stack.size();
    }
}
