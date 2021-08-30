package jstyChallenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class JstyArrayTest {

	@Test
	public void test() {
		JstyArray<Integer> data;

		data = new JstyArray<Integer>(10);

		for (int i = 0; i < 10; ++i) {
		    data.set(i, new Integer(i) );
		}

		int sum = 0;
		for ( int v : data ) {
		    if (v == 0)
		        continue; // empty cell
		    sum += v;
		}
		
		assertEquals((int) data.get(0), 0);
		assertEquals(sum, 45);
		assertEquals((int) data.get(1), 1);
		assertEquals((int) data.get(2), 2);
		assertEquals((int) data.get(3), 3);
		assertEquals((int) data.get(4), 4);
		assertEquals((int) data.get(5), 5);
		assertEquals((int) data.get(6), 6);
		assertEquals((int) data.get(7), 7);
		assertEquals((int) data.get(8), 8);
		assertEquals((int) data.get(9), 9);
	}

}
