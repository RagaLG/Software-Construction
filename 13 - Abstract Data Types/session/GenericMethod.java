package session;
public class GenericMethod {
    public static void printArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static <T> void printArrayGeneric(T[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        System.out.println("This is without using generic method");
        int[] array = new int[]{1,2,3,4,5};
        printArray(array);

        System.out.println("This is using generic method");
        Integer[] intArray = new Integer[]{5, 6, 7, 8, 9, 10};
        Double[] doubleArray = new Double[]{1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = new Character[]{ 'H', 'E', 'L', 'L', 'O' };
        printArrayGeneric(intArray);
        printArrayGeneric(doubleArray);
        printArrayGeneric(charArray);
    }
}
