package lab9;
import java.util.List;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testShortList() {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(2, 3, 1, 5, 4));
	    MergeSort.sort(l);
	    assertEquals(Arrays.asList(1, 2, 3, 4, 5), l);
		
	}
	
	@Test
	public void testReversedList() {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(5, 4, 3, 2, 1));
		MergeSort.sort(l);
	    assertEquals(Arrays.asList(1, 2, 3, 4, 5), l);
	}
	
	@Test
	public void testEmptyList() {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList());
		MergeSort.sort(l);
	    assertEquals(Arrays.asList(), l);
	}
	
	@Test
	public void testSingleElement() {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(5));
		MergeSort.sort(l);
	    assertEquals(Arrays.asList(5), l);
	}
	
	@Test
	public void testTies() {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(2, 4, 3, 2, 1));
		MergeSort.sort(l);
	    assertEquals(Arrays.asList(1, 2, 2, 3, 4), l);
	}
	
	@Test
	public void testLargeList() {
		List<Integer> l = new ArrayList<Integer>();
	    for (int i = 0; i < 10000; i ++) {
		l.add(10000 - i - 1);
	    }
	    MergeSort.sort(l);
	    for (int i = 0; i < 10000; i ++) {
		assertEquals(new Integer(i), l.get(i));
	    }
	}
	
	public void testExtraLargeList() {
		List<Integer> l = new ArrayList<Integer>();
	    for (int i = 0; i < 100000; i ++) {
		l.add(100000 - i - 1);
	    }
	    MergeSort.sort(l);
	    for (int i = 0; i < 100000; i ++) {
		assertEquals(new Integer(i), l.get(i));
	    }
	}

}
