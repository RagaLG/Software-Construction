package session;


public class HeapTest {
    public static void main(String[] args) {
        Heap heap = new ArrayHeap();
        heap.add(24);
        heap.add(73);
        heap.add(24);
        heap.add(60);
        
        for(int i: heap.toArray()){
            System.out.println(i);
        }
        System.out.println("Removing: " + heap.remove());
        for(int i: heap.toArray()){
            System.out.println(i);
        }
    }
}
