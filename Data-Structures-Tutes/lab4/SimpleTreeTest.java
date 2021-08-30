package lab4;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTreeTest {

	@Test
	public void testConstruction() {
		Tree t = new SimpleTree();
		
		assertEquals(null, t.getRoot());
		assertEquals(0, t.size());
		assertTrue(t.isEmpty());
	}
	
	@Test
	public void testSetRoot(){
		Tree t = new SimpleTree();
		Node r = new SimpleNode(1);
		
		t.setRoot(r);
		
		assertEquals(r, t.getRoot());
	}
	
	@Test
	public void testGetSize(){
		Tree t = new SimpleTree();
		Node A = new SimpleNode('A');
		Node B = new SimpleNode('B');
		Node C = new SimpleNode('C');
		
		t.setRoot(A);
		t.insert(A, B);
		t.insert(A, C);
		
		assertEquals(3, t.size());
		
		t.remove(B);
		
		assertEquals(2, t.size());
		
		t.remove(A);
		
		assertEquals(0, t.size());
	}
	
	@Test
	public void testIsEmpty(){
		Tree t = new SimpleTree();
		assertTrue(t.isEmpty());
		
		Node A = new SimpleNode('A');
		Node B = new SimpleNode('B');
		Node C = new SimpleNode('C');
		
		t.setRoot(A);
		t.insert(A, B);
		t.insert(A, C);
		
		assertFalse(t.isEmpty());
	}

}
