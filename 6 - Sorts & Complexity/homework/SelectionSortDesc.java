/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW06
The purpose of this assignment is to help us learn to implement sorting algorithms.
*/
package homework;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortDesc {
    private static Random RNG = new Random();
    /**
     * Sorts an array in descending order.
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] selectionSortD(int[] array){
        int currentIndex = array.length - 1;
        while(!(sortedDesc(array))){
            int index = currentIndex;
            for(int i = currentIndex; i>=0; i--){
                if(array[i] < array[index]){
                    index = i;
                }
            }
            swap(array,currentIndex, index);
            currentIndex--;
        }
        return array;
    }
    /**
     * Checks if an array is sorted in descending order.
     * @param array The array to be checked.
     * @return True if the array is sorted in descending order, false otherwise.
     */
    public static boolean sortedDesc(int[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i] < array[i+1]){
                return false;
            }
        }
        return true;
    }
    /**
     * Swaps two elements in an array.
     * @param array The array in which elements will be swapped.
     * @param a The index of the first element to be swapped.
     * @param b The index of the second element to be swapped.
     * @return The array after the elements have been swapped.
     */
    public static int[] swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return array;
    }
    /**
     * Generates an array of random integers of given size.
     * @param size The size of the array to be generated.
     * @return An array of random integers.
     */
    public static int[] makeArray(int size){
        int[] output = new int[size];
        for(int i=0; i<size; i++){
            output[i] = RNG.nextInt(size+1);
        }
        return output;
    }
    /**
     * The main method creates an array, sorts it in descending order using
     * selectionsortD(), and prints the unsorted and sorted arrays.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args){
        int[] array1 = makeArray(10);
        System.out.println("Unsorted: " + Arrays.toString(array1));
        int[] sortedArray = selectionSortD(array1);
        System.out.println("Sorted: " + Arrays.toString(sortedArray));
    }
}
// end of class SelectionSortDesc
