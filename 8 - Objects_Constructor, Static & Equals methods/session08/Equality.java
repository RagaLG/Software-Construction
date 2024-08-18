package session08;

public class Equality {
    public static void main(String[] args){
        int i = 17;
        int k = i;

        if(i==17){
            System.out.println("i==17, true");
        }

        if(i==k && k==17){
            System.out.println("i==k && k==17, true");
        }

        double d = 17;
        if(i==d){
            System.out.println("i==d, true");
        }
    }
}
