package Session03;

import java.util.Scanner;

public class Calender {
    public static String getSuffix(int dayNum){
        if(dayNum<1){
            return null;
        }
        switch(dayNum){
            case 11:
            case 12:
            case 13:
                return "th";
        }

        switch(dayNum % 10){
            case 1:
                return "st";
            case 2:
                 return "nd";
            case 3:
                return "rd";
            default :
                return "th";
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the month: ");
        int day = scanner.nextInt();
        String suffix = getSuffix(day);
        if(suffix == null){
            System.out.println("That is an invalid day");
        } else {
            System.out.println("It is the " + day + suffix + ".");
        }
    }
}
