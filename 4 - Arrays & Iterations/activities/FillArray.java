package activities;
import java.util.Scanner;

public class FillArray {
    public static int[] getArray(int length){
        int[] tens = new int[length];
        for(int i=0; i<length; i++){
            tens[i] = 10 * i;
        }
        return tens;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int length = scanner.nextInt();
        int[] tensarray = getArray(length);
        for(int i : tensarray){
            System.out.println(i);
        }
        /*
        for(int i=0; i<length; i++){
            System.out.println(tensarray[i]);
        }
        */
    }
}
