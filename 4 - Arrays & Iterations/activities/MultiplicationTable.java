package activities;

import java.lang.reflect.Array;

public class MultiplicationTable {
    public static void main(String[] args){
        int[][] tenstable = new int[10][10];
        
        for(int row=0; row<tenstable.length; row++){
            for(int col=0; col<tenstable[row].length; col++){
                tenstable[row][col] = (col+1) * (row+1);
                System.out.print(tenstable[row][col] + "  ");
                if(tenstable[row][col] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
}
