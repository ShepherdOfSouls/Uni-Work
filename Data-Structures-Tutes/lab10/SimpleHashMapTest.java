package lab10;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SimpleHashMapTest {

	@Test
	public void testConstruction() {
		HashMap h = new SimpleHashMap(5);
		
		assertEquals(0, h.size());
		assertEquals(true, h.isEmpty());
		assertEquals(Arrays.asList(), h.keys());
		assertEquals(Arrays.asList(), h.values());
		
	}
	
	@Test
	public void testSize() {
		HashMap h = new SimpleHashMap(5);
		
		assertEquals(0, h.size());
		h.put(1, "Alan");
		assertEquals(1, h.size());
		h.put(2, "Bob");
		assertEquals(2, h.size());
		h.put(3, "Chris");
		assertEquals(3, h.size());
		
		h.remove(1);
		assertEquals(2,h.size());
		h.remove(2);
		assertEquals(1,h.size());
		h.remove(3);
		assertEquals(0,h.size());
		
	}
	
	@Test
	public void testIsEmpty() {
		HashMap h = new SimpleHashMap(5);
		
		assertEquals(true, h.isEmpty());
		h.put(1, "Alan");
		assertEquals(false, h.isEmpty());
		h.put(2, "Bob");
		assertEquals(false, h.isEmpty());
		h.put(3, "Chris");
		assertEquals(false, h.isEmpty());
		
		h.remove(1);
		assertEquals(false, h.isEmpty());
		h.remove(2);
		assertEquals(false, h.isEmpty());
		h.remove(3);
		assertEquals(true, h.isEmpty());
		
	}
	
	@Test
	public void testSmallHashMap() {
		HashMap h = new SimpleHashMap(5);
		h.put(1, "Alan");
		h.put(2, "Bob");
		h.put(3, "Chris");
		assertEquals("Alan", h.get(1));
		assertEquals("Bob", h.get(2));
		assertEquals("Chris", h.get(3));
		
		h.remove(2);
		assertEquals(null, h.get(2));
		
		h.put(1, "Aardvarc");
		assertEquals("Aardvarc", h.get(1));
		
		h.put(29, "Test");
		assertEquals("Test", h.get(29));
		
	}
	
	@Test
	public void testHashFunction() {
		HashMap h = new SimpleHashMap(5);
		
		h.put("Bill", "Ben");
		
		assertEquals("Ben", h.get("Bill"));
		
		h.put(-3, "Herro");
		assertEquals("Herro", h.get(-3));
		
	}

}
