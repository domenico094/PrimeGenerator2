package it.unical.PrimeGenerator2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	
	private static MyMath math;
	
	@BeforeClass
	public static void prepare()
	{
		math = new MyMath();
		
	}
	
	@Test 
	public void primeNumbersGeneratorWorks()
	{
		//assertEquals(new LinkedList<Integer>(),math.primeNumbersGenerator(20));
		assertEquals(Arrays.asList(3),math.primeNumbersGenerator(1));
	}
	
	@Test 
	public void isPrime()
	{
		assertTrue(math.isPrime(7));
	}
}
