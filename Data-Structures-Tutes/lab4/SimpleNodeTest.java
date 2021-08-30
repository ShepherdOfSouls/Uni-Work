package lab4;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SimpleNodeTest {

	@Test
	public void testConstruction() {
		Node n = new SimpleNode(3);;
		assertEquals(null, n.getParent());
		assertEquals(new ArrayList<Node>(), n.getChildren());
		assertEquals(3, n.getElement());
		
	}
	
	@Test
	public void testSetParent(){
		Node n = new SimpleNode(2);
		Node p = new SimpleNode(3);
		n.setParent(p);
		
		assertEquals(p, n.getParent());
	}
	
	@Test
	public void testSetElement(){
		Node n = new SimpleNode(2);
		n.setElement(3);
		
		assertEquals(3, n.getElement());
	}
	
	@Test
	public void testSetChildren(){
		Node p = new SimpleNode(1);
		Node c1 = new SimpleNode(2);
		Node c2 = new SimpleNode(3);
		Node c3 = new SimpleNode(4);
		
		p.addChild(c1);
		p.addChild(c2);
		p.addChild(c3);
		p.removeChild(c2);
		
		assertTrue(p.getChildren().contains(c1));
		assertFalse(p.getChildren().contains(c2));
		assertTrue(p.getChildren().contains(c3));
	}

}
