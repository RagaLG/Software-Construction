package Session03;

import java.util.Scanner;

public class Register {
    public static String getChange(float charge, float payment){
        double change = payment - charge;
        if(change == 0){
            return "You have no change";
        }
        boolean owes = (change<0);
        if(owes){
            change = -1 * change;
        }
        int dollars = (int)change;
        double remaining = change - dollars;
        int cents = (int)(remaining * 100);
        return ((owes ? "You still owe " : "Your change is ") + dollars + " dollar"+(dollars==1 ? " ":"s ")
        + cents + " cent" + (cents==1 ? ".":"s."));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the charge: ");
        float charge = scanner.nextFloat();
        System.out.print("Enter the payment: ");
        float payment = scanner.nextFloat();
        String sentence = getChange(charge, payment);
        System.out.println(sentence);
    }
}
