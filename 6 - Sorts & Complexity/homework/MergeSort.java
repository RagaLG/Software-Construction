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

public class MergeSort {
    /**
     * Sorts an array of integers using the Merge Sort algorithm.
     * @param array The array to be sorted.
     */
    public static void mergeSort(int[] array){
        int length = array.length;
        if(length < 2){
            return;
        }
        int midIndex = length / 2;
        int[] left = new int[midIndex];
        int[] right = new int[length - midIndex];
        left = Arrays.copyOfRange(array, 0, midIndex); // Create a left subarray.
        right = Arrays.copyOfRange(array, midIndex, length); // Create a right subarray.
        // Divide the array
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right); // Merge the sorted left and right subarrays into the original array.
    }
    /**
     * Merges two sorted arrays into a single sorted array.
     * @param array The target array where the merged elements will be stored.
     * @param left  The left sorted array.
     * @param right The right sorted array.
     */
    public static void merge(int[] array, int[] left, int[] right){
        int leftsize = left.length;
        int rightsize = right.length;
        int i=0, j=0, k=0;
        while(i<leftsize && j<rightsize){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }       
        while(i<leftsize){
            array[k] = left[i];
            i++;
            k++;
        }
        while(j<rightsize){
            array[k] = right[j];
            j++;
            k++;
        }
    }
    /**
     * The main method generates an array of random integers, sorts it using mergeSort(),
     * and prints the unsorted and sorted arrays.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args){
        Random random = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = random.nextInt(1000);
        }
        System.out.println("Unsorted Array: " + Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

    }
}
// end of class MergeSort
