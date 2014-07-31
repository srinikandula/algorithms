package test.com.samples;

import junit.framework.Assert;

import org.junit.Test;

import srini.algorithms.designpatterns.BuilderTest;

public class TestBuilderPattern {

	
	@Test
	public void testBuilderPattern(){
		BuilderTest test = new BuilderTest.Builder().issue(1).testcase(2).build();
		Assert.assertEquals(1,test.getIssue());
		Assert.assertEquals(2,test.getTestcase());		
	}
}
