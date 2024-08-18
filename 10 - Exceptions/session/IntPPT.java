package session;

public class IntPPT {
    public static void main(String[] args) {
        try{
            String a = "abcd";
            int number = Integer.parseInt(a);
        } catch(Exception e){
            System.out.println("The following error occurred: " + e.getMessage());
        }
    }
}
