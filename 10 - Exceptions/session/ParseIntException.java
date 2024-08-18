package session;

public class ParseIntException {
    public static void main(String[] args){
        String a = "abcd";
        int number;
        try{
            number = Integer.parseInt(a);
        } catch(NumberFormatException e) {
            System.out.println("Conversion error: " + e.getMessage());
            System.out.println("Conversion error: " + e.getCause());
        } catch(IllegalArgumentException e1){
            System.out.println("Bad number format1");
        } 
        catch(Exception e){
            System.out.println("Bad number");
        } 
    }
}
