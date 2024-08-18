package activities;
import java.util.Scanner;

public class CountDown {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        while(num>=0){
            System.out.println(num);
            num--;
        } 
    }
}