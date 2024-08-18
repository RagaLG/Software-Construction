/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW13
The purpose of this assignment is to help us learn to implement Abstract Data Types (ADTs), 
Collection, Stacks, Queues and Lists using Java Generics.	
*/
package homework;

import java.util.NoSuchElementException;

import org.w3c.dom.Node;

public class MyLinkedList<E> extends MyAbstractList<E> {
	  private Node<E> head, tail;

	  /** Create a default list */
	  public MyLinkedList() {
	  }

	  /** Create a list from an array of objects */
	  public MyLinkedList(E[] objects) {
	    super(objects);
	  }

	  /** Return the head element in the list */
	  public E getFirst() {
		  // COMPLETE THIS METHOD
		  if (head == null) {
        throw new NoSuchElementException("The list is empty");
    	}
    	return head.element;
	}

	  /** Return the last element in the list */
	  public E getLast() {
		  // COMPLETE THIS METHOD
		  if (tail == null) {
			throw new NoSuchElementException("The list is empty");
		}
		return tail.element;
	  }

	  /** Add an element to the beginning of the list */
	  public void addFirst(E e) {
		  // COMPLETE THIS METHOD
		  Node<E> newNode = new Node<>(e);
    	  newNode.next = head;
    	  head = newNode;
		  size++;
		  if(tail == null){
			tail = head;
		  }
	}

	  /** Add an element to the end of the list */
	  public void addLast(E e) {
		  // COMPLETE THIS METHOD
		  Node<E> newNode = new Node<>(e);
		  if (tail == null) {
			  head = tail = newNode;
		  } else {
			  tail.next = newNode;
			  tail = tail.next;
		  }
		  size++;
	  }


	  @Override /** Add a new element at the specified index 
	   * in this list. The index of the head element is 0 */
	  public void add(int index, E e) {
		  // COMPLETE THIS METHOD
		  if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}
	
		if (index == 0) {
			addFirst(e);
		} else if (index == size) {
			addLast(e);
		} else {
			Node<E> newNode = new Node<>(e);
			Node<E> previous = head;
			for (int i = 0; i < index - 1; i++) {
				previous = previous.next;
			}
			newNode.next = previous.next;
			previous.next = newNode;
			size++;
		}
	  }

	  /** Remove the head node and
	   *  return the object that is contained in the removed node. */
	  public E removeFirst() {
		  // COMPLETE THIS METHOD
		  if (head == null) {
			throw new NoSuchElementException("The list is empty");
		}
		E removedElement = head.element;
		head = head.next;
		size--;
		if (head == null) {
			tail = null; // If the list is now empty
		}
		return removedElement;
	}

	  /** Remove the last node and
	   * return the object that is contained in the removed node. */
	  public E removeLast() {
		  // COMPLETE THIS METHOD
		  if (tail == null) {
			throw new NoSuchElementException("The list is empty");
		}
		E removedElement = tail.element;
		if (head == tail) {
			head = tail = null; // If there's only one element in the list
		} else {
			Node<E> current = head;
			while (current.next != tail) {
				current = current.next;
			}
			tail = current;
			tail.next = null;
		}
		size--;
		return removedElement;
	 }

	  @Override /** Remove the element at the specified position in this 
	   *  list. Return the element that was removed from the list. */
	  public E remove(int index) {
		  // COMPLETE THIS METHOD
		  //checkIndex(index);
    	if (index == 0) {
        	return removeFirst();
    	} else if (index == size - 1) {
        	return removeLast();
    	} else {
        	Node<E> previous = head;
        	for (int i = 0; i < index - 1; i++) {
            	previous = previous.next;
        	}
        	Node<E> current = previous.next;
        	previous.next = current.next;
        	size--;
        	return current.element;
    	}
	}

	  @Override /** Override toString() to return elements in the list */
	  public String toString() {
	    StringBuilder result = new StringBuilder("[");

	    Node<E> current = head;
	    for (int i = 0; i < size; i++) {
	      result.append(current.element);
	      current = current.next;
	      if (current != null) {
	        result.append(", "); // Separate two elements with a comma
	      }
	      else {
	        result.append("]"); // Insert the closing ] in the string
	      }
	    }

	    return result.toString();
	  }

	  @Override /** Clear the list */
	  public void clear() {
	    size = 0;
	    head = tail = null;
	  }

	  @Override /** Return true if this list contains the element e */
	  public boolean contains(E e) {
		  // COMPLETE THIS METHOD
		  Node<E> current = head;
		  while (current != null) {
			  if (current.element.equals(e)) {
				  return true;
			  }
			  current = current.next;
		  }
		  return false;
	  }

	  @Override /** Return the element at the specified index */
	  public E get(int index) {
		  // COMPLETE THIS METHOD
		  checkIndex(index);
		  Node<E> current = head;
		  for (int i = 0; i < index; i++) {
			  current = current.next;
		  }
		  return current.element;
	  }

	  @Override /** Return the index of the head matching element in 
	   *  this list. Return -1 if no match. */
	  public int indexOf(E e) {
		  // COMPLETE THIS METHOD
		  Node<E> current = head;
		  for (int i = 0; i < size; i++) {
			  if (current.element.equals(e)) {
				  return i;
			  }
			  current = current.next;
		  }
		  return -1;
	  }

	  @Override /** Return the index of the last matching element in 
	   *  this list. Return -1 if no match. */
	  public int lastIndexOf(E e) {
		  // COMPLETE THIS METHOD
		Node<E> current = head;
    	int lastIndex = -1;
    	for (int i = 0; i < size; i++) {
        		if (current.element.equals(e)) {
            lastIndex = i;
        	}
        	current = current.next;
    	}
    	return lastIndex;
	}

	  @Override /** Replace the element at the specified position 
	   *  in this list with the specified element. */
	  public E set(int index, E e) {
		  // COMPLETE THIS METHOD
		  checkIndex(index);
		  Node<E> current = head;
		  for (int i = 0; i < index; i++) {
			  current = current.next;
		  }
		  E replacedElement = current.element;
		  current.element = e;
		  return replacedElement;
	  }

	  @Override /** Override iterator() defined in Iterable */
	  public java.util.Iterator<E> iterator() {
	    return new LinkedListIterator();
	  }

	  private void checkIndex(int index) {
	    if (index < 0 || index > size)
	      throw new IndexOutOfBoundsException
	        ("Index: " + index + ", Size: " + size);
	  }
	  
	  private class LinkedListIterator 
	      implements java.util.Iterator<E> {
	    private Node<E> current = head; // Current index 
	    
	    @Override
	    public boolean hasNext() {
	      return (current != null);
	    }

	    @Override
	    public E next() {
	      E e = current.element;
	      current = current.next;
	      return e;
	    }

	    @Override
	    public void remove() {
			// COMPLETE THIS METHOD
			if (current == null) {
				throw new IllegalStateException("No element to remove.");
			}
			if (current == head) {
				head = head.next;
				size--;
			} else {
				Node<E> previous = head;
				while (previous.next != current) {
					previous = previous.next;
				}
				previous.next = current.next;
				if (current == tail) {
					tail = previous;
				}
				size--;
			}
			current = null; // Reset the current reference
	    }
	  }
	  
	  private static class Node<E> {
	    E element;
	    Node<E> next;

	    public Node(E element) {
	      this.element = element;
	    }
	  }
	}
// end of class MyLinkedList
