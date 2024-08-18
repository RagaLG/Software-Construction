package session08;

import java.util.Scanner;

public class StringTester {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String x = "Buuttercup";
        String y = "Buuttercup";
        String z = "Thunder";
        System.out.println("x==x " + (x==x));
        System.out.println("x==y " + (x==y));
        System.out.println("x==z " + (x==z));

        System.out.println("Enter two strings: ");
        System.out.print("Enter String a: ");
        String a = scanner.nextLine();
        System.out.print("Enter String b: ");
        String b = scanner.nextLine();
        System.out.println("a==b " + (a==b));
    }
}
