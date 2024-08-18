package activities;

import java.util.Scanner;

public class CountUp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for(int i=0; i<=num; i++){
            System.out.println(i);
        }
    }
}
