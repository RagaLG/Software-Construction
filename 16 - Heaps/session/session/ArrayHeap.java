package session;

import java.util.Arrays;

public class ArrayHeap implements Heap {
    int[] array;
    int size;
    public ArrayHeap() {
        this.array = new int[8];
        this.size = 0;
    }

    /**
     * Sifts a value up from the specified index in a heap.
     *
     * @param array The heap.
     * @param index The index to begin sifting up.
     */
    static void siftUp(int[] array, int index) {
        int parent = (index - 1) / 2;
        while(array[parent] > array[index]) {
            swap(array, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    /**
     * Sifts a value down from the root in a heap.
     *
     * @param array The heap.
     * @param size The size of the heap.
     */
    static void siftDown(int[] array, int size) {
        int to = 0;
        int from;
        do {
            from = to;

            int left = 2 * from + 1;
            int right = left + 1;
            if(left < size && array[left] < array[to]) {
                to = left;
            }

            if(right < size && array[right] < array[to]) {
                to = right;
            }

            swap(array, from, to);

        } while(from != to);
    }

    /**
     * Swaps the values at the specified indexes.
     *
     * @param array The array in which the values should be swapped.
     * @param from The first index.
     * @param to The second index.
     */
    static void swap(int[] array, int from, int to) {
        if(from != to) {
            int tmp = array[from];
            array[from] = array[to];
            array[to] = tmp;
        }
    }

    @Override
    public void add(int value) {
        if(size==array.length){
            int[] newArray = Arrays.copyOf(array, size*2);
            this.array = newArray;
        }
        this.array[size] = value;
        siftUp(this.array, size);
        size++;
    }

    @Override
    public int remove() {
        int retVal = this.array[0];
        size--;
        this.array[0] = array[size];
        this.array[size] = 0;
        siftDown(this.array, size);
        return retVal;
    }

    @Override
    public int size() {
        return size;
    }

    public int[] toArray() {
        return Arrays.copyOf(array, size);
    }
}