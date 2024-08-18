package session;

import java.util.Arrays;

public class Sorts {
    public static int[] selectionSort(int[] array){
        int currentIndex = 0;
        while(!SortUtilities.sorted(array)){
            System.out.println("Selection step: " + Arrays.toString(array));
            int minIndex = currentIndex;
            for(int i = currentIndex; i<array.length; i++){
                if(array[i] < array[minIndex]){
                    minIndex = i;
                }
            }
            SortUtilities.swap(array, currentIndex, minIndex);
            currentIndex++;
        }
        System.out.println("Selection step: " + Arrays.toString(array));
        return array;
    }
    public static void main(String[] args){
        int[] array = SortUtilities.makeArray(10);
        selectionSort(array);
    }
}
