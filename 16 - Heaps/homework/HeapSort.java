/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW18
The purpose of this assignment is to help us understand the concept of Heaps and implement them.
*/
package homework;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The HeapSort class demonstrates sorting using a heap data structure.
 * It generates a set of unique random numbers, adds them to a heap, and then
 * removes them to create a sorted array.
 */
public class HeapSort {
    /**
     * checkIfExists checks if a value exists in an array.
     * @param array The array to check.
     * @param value The value to check for.
     * @return true if the value exists in the array, false otherwise.
     */
    public static boolean checkIfExists(ArrayList<Integer> array, int value){
        return array.contains(value);
    }
    public static void main(String[] args) {
        Random random = new Random();
        Heap heap = new ArrayHeap();
        ArrayList<Integer> uniqueInt = new ArrayList<>();
        System.out.println("Generating unique random numbers: ");
        for (int i = 0; i < 50; i++) {
            int randomNum;
            do {
                randomNum = random.nextInt(101);
            } while (checkIfExists(uniqueInt, randomNum));
            uniqueInt.add(randomNum);
            System.out.println(randomNum);
            heap.add(randomNum);
        }
        System.out.println("Generated Heap: ");
        System.out.println(heap.toString());

        int[] sortedArray = new int[heap.size()];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = heap.remove();
        }
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(sortedArray));
    }
}
// end of class HeapSort
