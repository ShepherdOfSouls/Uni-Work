package jstyChallenge;
/* 
 * An iterator for the class JstyArray. Performs all standard tasks of an iterator. 
 * Specifically, when calling next() on an invalid iterator, a NoSuchElementException is raised by this class.
 *
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class JstyIterator<E> implements Iterator<E>
{
	protected JstyArray<E> array;
	protected int positionIndex;
	
	public JstyIterator(JstyArray<E> array){
		this.array = array;
		this.positionIndex = 0;
	}
	
	public int getIndex(){
		return positionIndex;
	}

	public boolean hasNext() {
		if(positionIndex + 1 >= array.getArray().length){
			return false;
		}
		else{
			return true;
		}
	}

	public E next() throws NoSuchElementException {
		if(hasNext() == false){
			throw new NoSuchElementException("No next element.");
		}
		
		E toReturn = array.get(positionIndex + 1);
		positionIndex++;
		return toReturn;
	}
	
	public void remove() { 
		// we need this method for the nagging Java compiler
		// you may leave empty
	}
	
}
