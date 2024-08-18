package activities;
import java.util.Scanner;

public class Calculator {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        System.out.println("x = " + x + ", " + "y = "+ y);
        System.out.println("x + y = " + (x+y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x / y = " + (x/y));
    }

    public static void main(String[] args){
        //calculate(3.4f,21.7f);
        //calculate(5.8f,28.9f);
        //calculate(9.88f,34.6f);
        calculate();

    }
}
