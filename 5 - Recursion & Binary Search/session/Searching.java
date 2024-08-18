package session;

public class Searching {
    public static boolean search(int[] array, int target, int index){
        if(array[index]==target){
            return true;
        } else{
            if(index+1 == array.length){
                return false;
            }
            return search(array, target, index+1);
        }
    }

    public static void main(String[] args){
        int[] test = new int[]{1,3,5,7,11,17};
        System.out.println(search(test, 11, 0));
        System.out.println(search(test, 119, 0));
    }
}
