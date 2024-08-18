package Session03;

import java.util.Scanner;

public class Week {
    public static void nameOfDay(int dayNum){
        switch(dayNum){
            case 0: 
                System.out.println("It is Monday");
                break;
            case 1: 
                System.out.println("It is Tuesday"); 
                break;
            case 2: 
                System.out.println("It is Wednesday");
                break; 
            case 3: 
                System.out.println("It is Thursday"); 
                break;
            case 4: 
                System.out.println("It is Friday");
                break; 
            case 5: 
                System.out.println("It is Saturday"); 
                break;
            case 6: 
                System.out.println("It is Sunday");
                break;
            default :
                System.out.println("That is not a valid day.");  
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int dayNum = scanner.nextInt();
        nameOfDay(dayNum);
    }
}
