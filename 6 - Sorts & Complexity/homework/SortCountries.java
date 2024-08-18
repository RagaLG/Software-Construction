/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW06
The purpose of this assignment is to help us learn to implement sorting algorithms.
*/
package homework;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;
//import session.SortUtilities;

public class SortCountries {
    /**
     * Sorts an array of names(String).
     *
     * @param array The array of names to be sorted.
     * @return The sorted array of names.
     */
    public static String[] selectionSort(String[] array){
        int currentIndex = 0;
        while(!sorted(array)){
            int minIndex = currentIndex;
            for(int i = currentIndex; i<array.length; i++){
                if(array[i].charAt(0) < array[minIndex].charAt(0)){
                    minIndex = i;
                }
            }
            swap(array, currentIndex, minIndex);
            currentIndex++;
        }
        return array;
    }
    /**
     * Checks if an array of names(String) is sorted in alphabetical order.
     *
     * @param array The array of names(String) to be checked.
     * @return True if the array is sorted, false otherwise.
     */

    public static boolean sorted(String[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i].charAt(0) > array[i+1].charAt(0)){
                return false;
            }
        }
        return true;
    }
    /**
     * Swaps two elements in an array of names.
     *
     * @param array The array in which elements will be swapped.
     * @param a  The index of the first element to be swapped.
     * @param b  The index of the second element to be swapped.
     * @return The array after the elements have been swapped.
     */
    public static String[] swap(String[] array, int a, int b){
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return array;
    }
    /**
     * The main method allows the user to input country names and their populations,
     * sorts the countries in alphabetical order, and displays the sorted countries
     * along with their respective populations.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String[] countries = new String[5];
        int[] population = new int[5];
        Dictionary<String, Integer> dict = new Hashtable<String, Integer>();
        System.out.println("Enter 5 countries and their population");
        for(int i = 0; i < countries.length; i++){
            System.out.print("Enter country " + (i+1) + ": ");
            countries[i] = scan.nextLine();
            System.out.print("Enter population of country " + (i+1) + ": ");
            population[i] = scanner.nextInt();
            dict.put(countries[i], population[i]);
        }
        System.out.println("Unsorted Countries: "+ Arrays.toString(countries));
        System.out.println("Population: " + Arrays.toString(population));
        String[] sortedC = selectionSort(countries);
        int[] sortedP = new int[5];
        System.out.println("Sorted Countries: " + Arrays.toString(sortedC));
        for(int i=0; i<population.length; i++){
            sortedP[i] = dict.get(sortedC[i]) ;
        }
        System.out.println("Respective Population: " + Arrays.toString(sortedP));
    }
}
// end of class SortCountries
