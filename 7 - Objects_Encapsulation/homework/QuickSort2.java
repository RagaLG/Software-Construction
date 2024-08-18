/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us learn sort methods and understand the concept of 
Objects(individual instance of a class) and define methods to modify or use them.
*/
package homework;

import java.util.Arrays;
import java.util.Random;

public class QuickSort2 {
    /**
     * Sorts an integer array using the QuickSort algorithm in descending order.
     * @param array      The array to be sorted.
     * @param lowIndex   The index of the first element
     * @param highIndex  The index of the last element
     */
    public static void quicksort(int[] array, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex){
            return;
        }
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while(leftPointer < rightPointer){
            while(array[leftPointer] >= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(array[rightPointer] <= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            exchange(array, leftPointer, rightPointer); // exchange elements at left and right pointers.
        }
        exchange(array, leftPointer, highIndex);
        quicksort(array, lowIndex, leftPointer-1); //Recursively sort the left subarray.
        quicksort(array, leftPointer+1, highIndex); // Recursively sort the right subarray.
    }
    /**
     * Swaps two elements in an integer array.
     * @param array The array in which elements will be swapped.
     * @param i  The index of the first element to be swapped.
     * @param j  The index of the second element to be swapped.
     */
    private static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /**
     * A test method to demonstrate the QuickSort algorithm.
     * @param args
     */
    public static void main(String[] args) {
        //int[] arr = { 5, 2, 9, 3, 8, 4, 0, 1, 6, 7 };
        Random random = new Random();
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.print("Before sorting: ");
        System.out.println(Arrays.toString(arr));

        quicksort(arr,0, arr.length - 1);

        System.out.print("After sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}
// end of class QuickSort2
