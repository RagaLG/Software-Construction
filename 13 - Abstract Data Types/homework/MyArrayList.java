/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW13
The purpose of this assignment is to help us learn to implement Abstract Data Types (ADTs), 
Collection, Stacks, Queues and Lists using Java Generics.	
*/
package homework;

public class MyArrayList<E> extends MyAbstractList<E>
{
	  public static final int INITIAL_CAPACITY = 2;
	  private E[] data = (E[])new Object[INITIAL_CAPACITY];

	  /** Create a default list */
	  public MyArrayList() {
	  }

	  /** Create a list from an array of objects */
	  public MyArrayList(E[] objects) {
	    for (int i = 0; i < objects.length; i++)
	      add(objects[i]); // Warning: don�t use super(objects)!
	  }

	  @Override /** Add a new element at the specified index */
	  public void add(int index, E e) 
	  {
	    checkIndex(index);
	    
	    ensureCapacity();

	    // Move the elements to the right after the specified index
	    for (int i = size - 1; i >= index; i--)
	      data[i + 1] = data[i];

	    // Insert new element to data[index]
	    data[index] = e;

	    // Increase size by 1
	    size++;
	  }

	  /** Create a new larger array, double the current size + 1 */
	  private void ensureCapacity() {
	    if (size >= data.length) {
			System.out.println("Max Capacity detected! Doubling the size before inserting a new element");
	      E[] newData = (E[])(new Object[size * 2]);
	      System.arraycopy(data, 0, newData, 0, size);
	      data = newData;
	    }
	  }

	  @Override /** Clear the list */
	  public void clear() {
	    // COMPLETE THIS METHOD
		size = 0;
    	data = (E[]) new Object[INITIAL_CAPACITY];
	  }

	  @Override /** Return true if this list contains the element */
	  public boolean contains(E e) {
		  // COMPLETE THIS METHOD
		for (int i = 0; i < size; i++) {
			if (data[i].equals(e)) {
				return true;
			}
		}
		return false;
	  }

	  @Override /** Return the element at the specified index */
	  public E get(int index) {
		  // COMPLETE THIS METHOD
		checkIndex(index);
    	return data[index];
	  }

	  private void checkIndex(int index) {
		  // COMPLETE THIS METHOD
		if (index < 0 || index > data.length) {
			throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
		}
	  }
	  
	  @Override /** Return the index of the first matching element 
	   *  in this list. Return -1 if no match. */
	  public int indexOf(E e) {
			  // COMPLETE THIS METHOD
			  for (int i = 0; i < size; i++) {
				if (data[i].equals(e)) {
					return i;
				}
			}
			return -1;
	  }

	  @Override /** Return the index of the last matching element 
	   *  in this list. Return -1 if no match. */
	  public int lastIndexOf(E e) {
			  // COMPLETE THIS METHOD
			  for (int i = size - 1; i >= 0; i--) {
				if (data[i].equals(e)) {
					return i;
				}
			}
			return -1;
	  }

	  @Override /** Remove the element at the specified position 
	   *  in this list. Shift any subsequent elements to the left.
	   *  Return the element that was removed from the list. */
	  public E remove(int index) {
			  // COMPLETE THIS METHOD
			  checkIndex(index);
			  E removedElement = data[index];
			  for (int i = index; i < size - 1; i++) {
				  data[i] = data[i + 1];
			  }
			  data[size - 1] = null; // Optional, to help with garbage collection
			  size--;
			  return removedElement;
	  }

	  @Override /** Replace the element at the specified position 
	   *  in this list with the specified element. */
	  public E set(int index, E e) {
			  // COMPLETE THIS METHOD
			  checkIndex(index);
			  E replacedElement = data[index];
			  data[index] = e;
			  return replacedElement;
	  }

	  @Override
	  public String toString() {
			  // COMPLETE THIS METHOD
			  StringBuilder sb = new StringBuilder();
			  sb.append("[");
			  for (int i = 0; i < size; i++) {
				  sb.append(data[i]);
				  if (i < size - 1) {
					  sb.append(", ");
				  }
			  }
			  sb.append("]");
			  return sb.toString();
	  }

	  /** Trims the capacity to current size */
	  public void trimToSize() {
			  // COMPLETE THIS METHOD
			  E[] newData = (E[]) new Object[size];
			  System.arraycopy(data, 0, newData, 0, size);
			  data = newData;
	  }

	  @Override /** Override iterator() defined in Iterable */
	  public java.util.Iterator<E> iterator() {
	    return new ArrayListIterator();
	  }
	 
	  private class ArrayListIterator 
	      implements java.util.Iterator<E> {
	    private int current = 0; // Current index 

	    @Override
	    public boolean hasNext() {
	      return (current < size);
	    }

	    @Override
	    public E next() {
	      return data[current++];
	    }

	    @Override
	    public void remove() {
			MyArrayList.this.remove(current);
	  }
	}
}
// end of class MyArrayList
