/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of the assignment is to learn and use boolean expressions and conditionals to
implement a variety of programs.
*/
package homework;

import java.util.Scanner;

public class DateTransform {
    public static String getSuffix(int dayNum){
        /*
        This method takes in a string value of date as "YYYY/MM/DD"
        and returns a string as month day, year.
        Eg: Given "2019/09/04", returns "September 4th, 2019"
         */
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
    
    public static String transformDate(String dateFormat){
        String[] parts = dateFormat.split("/");
        String year = parts[0];
        String month = parts[1];
        int day = Integer.valueOf(parts[2]);
        String suffix = getSuffix(day);
        String monthName = "";
        
        switch(month){
            case "01":
                monthName = "January";
                break;
            case "02":
                monthName = "February";
                break;
            case "03":
                monthName = "March";
                break;
            case "04":
                monthName = "April";
                break;
            case "05":
                monthName = "May";
                break;
            case "06":
                monthName = "June";
                break;
            case "07":
                monthName = "July";
                break;
            case "08":
                monthName = "August";
                break;
            case "09":
                monthName = "September";
                break;
            case "10":
                monthName = "October";
                break;
            case "11":
                monthName = "November";
                break;
            case "12":
                monthName = "December";
                break;
        }
        return monthName + " " + day + suffix + ", " + year;
    }
    
    public static void main(String[] args){
        /*
        The main method asks the user to enter a date in the format "YYYY/MM/DD"
        and prints the date in the format month day, year.
         */      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in YYYY/MM/DD format: ");
        String userDate = scanner.nextLine();
        String transformed = transformDate(userDate);
        System.out.println(transformed);
    }
}
// end of class DateTransform
