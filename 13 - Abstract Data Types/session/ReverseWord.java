package session;

public class ReverseWord {
    public static void main(String[] args) {
        NodeStack<String> stack = new NodeStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("ABC after using stack:");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
