package com.sampleproject.testyantra.sampleTestcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sampleproject.testyantra.genericutility.BaseClass;
import com.sampleproject.testyantra.pomrepositorylib.CreateProductPage;
import com.sampleproject.testyantra.pomrepositorylib.HomePage;
import com.sampleproject.testyantra.pomrepositorylib.ProductInformationPage;
import com.sampleproject.testyantra.pomrepositorylib.ProductsPage;

//@Listeners(com.vtiger.takebizglobal.genericUtility.ListenerImplementingClass.class)
public class SearchProductTest extends BaseClass{
	
	
	@Test(groups = {"smokeTest"})
	public void SampleOneTest() throws Throwable {
		
		HomePage home = new HomePage(driver);
		home.getProductsLink().click();
				
		ProductsPage proPage = new ProductsPage(driver);
		proPage.getCreateProductLink().click();
		System.out.println("Create product page displayed successfully");
		
		Assert.assertEquals(true, true);
		System.out.println("Test case pass");
		
	}
	
	@Test(groups = {"regressionTest"})
	public void SampleTwoTest() throws Throwable {
		
		HomePage home = new HomePage(driver);
		
		home.getProductsLink().click();
		System.out.println("Product page displayed successfully");
		
		ProductsPage proPage = new ProductsPage(driver);
		proPage.getCreateProductLink().click();
		System.out.println("Create product page displayed successfully");
		
		Assert.assertEquals(false, true);
		System.out.println("Test case pass");
		
		
	}

	@Test(groups = {"regressionTest"})
	public void SampleThreeTest() throws Throwable {
		
		HomePage home = new HomePage(driver);
		home.getProductsLink().click();
		
		ProductsPage proPage = new ProductsPage(driver);
		proPage.getCreateProductLink().click();
		
		Assert.assertEquals(true, true);
		System.out.println("Test case pass");
				
	}
	
	@Test(groups = {"regressionTest"})
	public void SampleFourTest() throws Throwable {
		
		HomePage home = new HomePage(driver);
		home.getProductsLink().click();
		
		ProductsPage proPage = new ProductsPage(driver);
		proPage.getCreateProductLink().click();
		
		Assert.assertEquals(true, false);
		System.out.println("Test case pass");
				
	}
	
}
