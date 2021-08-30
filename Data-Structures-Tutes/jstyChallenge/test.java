package jstyChallenge;

import java.util.NoSuchElementException;

public class test {

	public static void main(String[] args) {
		JstyArray<Integer> data;

		data = new JstyArray<Integer>(10);

		for (int i = 0; i < 10; ++i) {
		    data.set(i, new Integer(i) );
		}
		try {
		    int sum = 0;
		    for ( int v : data ) {
		        if (v == 0) continue;
		        if (v < 7)
		            data.remove(0); // remove the first element
		        // continue looping
		        sum += v;
		    }
		    System.out.println(sum);
		} catch (NoSuchElementException nsee) {
		    // ... handle as needed
		}

	}

}
