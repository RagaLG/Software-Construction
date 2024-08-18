package session;

public class Fibonacci {
    public static int fibonacci(int n){
        /*
        if(n<0){
            return -1;
        } else if(n==1 || n==2){
            return n-1;
        } else {
            int fib_1 = fibonacci(n-1);
            int fib_2 = fibonacci(n-2);
            return (fib_1 + fib_2);
        }
        */     
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } 
    }
    public static void main(String[] args){
        System.out.println(fibonacci(8));
    }
}
