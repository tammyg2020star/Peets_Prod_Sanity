package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.Locations;
import com.crm.qa.pages.Login_page;
import com.qa.base.testbase;

public class Locationpagetest extends testbase
{
	Locations loc;
	public Locationpagetest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loc=new Locations();
	} 
	/*@Test(priority=1)
		public void findaproductlinktest() throws InterruptedException
		{
			loc.clickonfindaproduct();
			//Assert.assertEquals(loc.clickonfindaproduct(), "https://www.peets.com/product-locator");
		}*/
	@Test(priority=2)
	public void categorieslinktest() throws InterruptedException
	{
	 loc.clickoncategories();		
	}
	/*
	@Test(priority=3)
	public void sellectmulti() throws InterruptedException
	{
		loc.selectmultiple();
	}
	
	@Test(priority=4)
	public void expandespress() throws InterruptedException
	{
		loc.expandespressocap();
	}
	*/
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
