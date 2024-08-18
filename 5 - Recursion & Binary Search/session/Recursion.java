package session;

public class Recursion {
    // Methods
    public static void countDown(int n){
        for(int i=n; i>=0; i--){
            System.out.println(i);
        }
    }
    public static int countDownRec(int n){
        /*
        System.out.println(n);
        if(n>0){
            countDownRec(n-1);
        }
        */
        if(n<0){
            return 0;
        } else {
            System.out.println(n);
            int next = n-1;
            int rest = countDownRec(next);
            return n + rest;
        }
    }
    public static void countUp(int n){ 
        if(n>=0){
            countUp(n-1);
            System.out.println(n);
        }
    }
    // Main method
    public static void main(String[] args){
        countDown(10);
        countUp(10);
        System.out.println("Total: " + countDownRec(10));
        // countUp(200000);  Activity: Blow up the stack
    }
}