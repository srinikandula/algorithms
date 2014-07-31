package test.com.samples;

import org.junit.Assert;
import org.junit.Test;

import srini.algorithms.NumberConverter;

public class TestNumberConversion {

	@Test
	public void checkDecimalToBinaryConversion(){
		NumberConverter conversion = new NumberConverter();
		Assert.assertEquals(111, conversion.sriniDecimalToBinary(7));
		Assert.assertEquals(false, conversion.sriniDecimalToBinary(7) == 101);
		Assert.assertEquals(101, conversion.sriniDecimalToBinary(5));
	}
	@Test 
	public void checkBinaryToDecimalConversion(){
		NumberConverter converter = new NumberConverter();
		Assert.assertEquals(7, converter.sriniBinaryToDecimal(111));
		Assert.assertEquals(5, converter.sriniBinaryToDecimal(101));
	}
}
