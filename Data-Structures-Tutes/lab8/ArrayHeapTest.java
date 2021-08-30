package lab8;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayHeapTest {

	@Test
	public void testConstruction() {
		Heap h = new ArrayHeap();
		assertEquals(0, h.size());
		assertEquals(true, h.isEmpty());
	}
	
	@Test
	public void testSmallHeap(){
		Heap h = new ArrayHeap();
	    h.insert(2, "A");
	    h.insert(5, "B");
	    h.insert(8, "D");
	    h.insert(9, "E");
	    h.insert(6, "C");
	    
	    assertEquals("A", h.removeRoot());
	    assertEquals("B", h.removeRoot());
	    assertEquals("C", h.removeRoot());
	    assertEquals("D", h.removeRoot());
	    assertEquals("E", h.removeRoot());
	}
	
	@Test
	public void testSize(){
		Heap h = new ArrayHeap();
	    h.insert(2, "A");
	    assertEquals(1, h.size());
	    h.insert(5, "B");
	    assertEquals(2, h.size());
	    h.insert(8, "D");
	    assertEquals(3, h.size());
	    h.removeRoot();
	    assertEquals(2, h.size());
	    h.removeRoot();
	    assertEquals(1, h.size());
	    h.removeRoot();
	    assertEquals(0, h.size());
	}
	
	@Test
	public void testIsEmpty(){
		Heap h = new ArrayHeap();
	    h.insert(2, "A");
	    assertEquals(false, h.isEmpty());
	    h.insert(5, "B");
	    assertEquals(false, h.isEmpty());
	    h.insert(8, "D");
	    assertEquals(false, h.isEmpty());
	    h.removeRoot();
	    assertEquals(false, h.isEmpty());
	    h.removeRoot();
	    assertEquals(false, h.isEmpty());
	    h.removeRoot();
	    assertEquals(true, h.isEmpty());
	}

}
