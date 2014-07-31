package test.com.samples;

import org.junit.Assert;

import org.junit.Test;

import srini.algorithms.SumOfNDigitNumbers;

public class TestSumOfDigitNumbers {

	@Test
	public void testSumCalculator(){
		SumOfNDigitNumbers calculator = new SumOfNDigitNumbers();
		Assert.assertEquals(33,calculator.calculateSum(2));
		Assert.assertEquals(1332,calculator.calculateSum(3));
		
	}
}
