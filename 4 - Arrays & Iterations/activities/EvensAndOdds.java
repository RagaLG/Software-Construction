package activities;
import java.util.Scanner;

public class EvensAndOdds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;      
        do{
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
            System.out.println((num%2 == 0)? "Even." : "Odd.");
        } while(num != 0);
        System.out.println("Done!");
    }
}
