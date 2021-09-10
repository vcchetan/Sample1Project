package com.sampleproject.testyantra.sampleTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1Test {

	@Test(dependsOnMethods="Program5Test", priority=-5)
	public void Program1Test() {
		Assert.assertEquals(true, true);
		System.out.println("Sample 1 test executed");
	}
	
	@Test(enabled = true, priority=-4)
	public void Program2Test() {
		Assert.assertEquals(true, true);
		System.out.println("Sample 2 test executed");
	}
	
	@Test(priority=0 )
	public void Program5Test() {
		Assert.assertEquals(true, true);
		System.out.println("Sample 5 test executed");
	}
	
	@Test(priority=-1)
	public void Program3Test() {
		Assert.assertEquals(true, true);
		System.out.println("Sample 3 test executed");
	}
	
	@Test(priority=1)
	public void Srogram4Test() {
		Assert.assertEquals(true, true);
		System.out.println("Sample 4 test executed");
	}
	
	@Test(priority=1)
	public void Program6Test() {
		Assert.assertEquals(true, true);
		System.out.println("Sample 6 test executed");
	}
}
