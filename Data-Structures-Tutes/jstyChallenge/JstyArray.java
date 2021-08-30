package jstyChallenge;
/* 
 * An array that implements the Iterable interface. 
 * Returns an iterator that would raise an exception if the array was modified (set or remove)
 *
 */

import java.util.LinkedList;

public class JstyArray<E> implements Iterable<E>
{
	// YOUR CODE ANYWHERE IN THIS CLASS

	private E[] array;
	public static final int CAPACITY = 100;
	private int currentSize;
	// there could be more instance variables!


	/* initialise array with capacity. If capacity is less than 1, use CAPACITY.
	*/
	public JstyArray(int capacity) {
		if(capacity < 1){
			this.array = (E[]) new Object[CAPACITY];
		}
		else{
			this.array = (E[]) new Object[capacity];
		}
		
		this.currentSize = array.length;
	}
	
	public E[] getArray(){
		return array;
	}
	
	public int getSize(){
		return currentSize;
	}

	/* if index is outside range of array. simply return 
	*/
	public void set(int i, E val) {
		JstyIterator<E> iterator = this.iterator();
		while(iterator.hasNext()){
			if(iterator.getIndex() == i){
				array[iterator.getIndex()] = null;
			}
			else{
				iterator.next();
			}
		}
		
		return;
	}

	/* if index is outside range of array. return null 
	*/
	public E get(int i)  {
		if(i >= array.length){
			return null;
		}
		
		return this.array[i];
	}

	/* if index is outside range of array. return null
	*/
	public E remove(int i) {
		E temp = (E) new Object();
		JstyIterator<E> iterator = this.iterator();
		while(iterator.hasNext()){
			if(iterator.getIndex() == i - 1){
				temp = iterator.next();
				array[iterator.getIndex()] = null;
				return temp;
			}
			else{
				iterator.next();
			}
		}
		
		return null;
		
		
	}
			
	
	public JstyIterator<E> iterator() {
		return new JstyIterator(this);
	}
}
