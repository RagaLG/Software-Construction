package session;

import java.util.Arrays;
import java.util.Random;

public class SortUtilities {
    private static Random RNG = new Random();

    public static boolean sorted(int[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static int[] swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return array;
    }
    public static int[] makeArray(int size){
        int[] output = new int[size];
        for(int i=0; i<size; i++){
            output[i] = RNG.nextInt(size+1);
        }
        return output;
    }

    public static void main(String[] args){
        int[] array = {5, 6, 7, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(sorted(array));
        int[] swaped = swap(array, 0, 5);
        System.out.println(Arrays.toString(swaped));
        System.out.println(Arrays.toString(makeArray(10)));
    }
}