package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void testZeroes(){
		assertEquals(0, SimpleCalculator.add(0, 0));
		assertEquals(0, SimpleCalculator.subtract(0, 0));
		assertEquals(0, SimpleCalculator.multiply(0, 0));
	}
	@Test
	public void testAdd() {
		int result = SimpleCalculator.add(2,3);
		
		assertEquals(5, result);
		assertEquals(4, SimpleCalculator.add(3, 1));
		assertEquals(4, SimpleCalculator.add(1, 3));
	}
	@Test
	public void testSubtract()
	{
		assertEquals(-2, SimpleCalculator.subtract(1, 3));
		assertEquals(2, SimpleCalculator.subtract(3, 1));
	}
	@Test
	public void testMultiply()
	{
		assertEquals(3, SimpleCalculator.multiply(1, 3));
		assertEquals(0, SimpleCalculator.multiply(0, 10));
	}
	@Test
	public void testDivide()
	{
		assertEquals(2.0, SimpleCalculator.divide(10, 5), 0.01);
		assertEquals(0.0, SimpleCalculator.divide(0, 10), 0.01);
	}
	
	@Test
	public void testEnglishCalculate()
	{
		assertEquals(20, EnglishCalculator.calculate("4 times 5"), 0.01);
		assertEquals(12, EnglishCalculator.calculate("2 plus 10"), 0.01);
		assertEquals(-1, EnglishCalculator.calculate("6 minus 7"), 0.01);
		assertEquals(3, EnglishCalculator.calculate("15 divided by 5"), 0.01);
	}

}
