package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.Coffeepage;
import com.crm.qa.pages.Searchpage;
import com.crm.qa.pages.shopcoffee;
import com.qa.Util.testutil;
import com.qa.base.testbase;

public class Coffeepagetest extends testbase
{
	Coffeepage coffee;
	
	
	public Coffeepagetest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		coffee=new Coffeepage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} 
	
	@Test(priority=1)
	public void searchcoffeitem() throws InterruptedException 
	{
		coffee.searchitem();
		
	}
	
	@Test(priority=2)
	public void coffeePDPpage() throws InterruptedException
	{
		coffee.openPDPpage();
	}
	
	@Test(priority=3)
	public void incresedecrease() throws InterruptedException
	{
		//coffee.increseanddescreseqty();
		coffee.openPDPpage();
		coffee.increseanddescreseqty();
		
	}
	
	@Test(priority=4)
	public void coffeeitemtocart() throws InterruptedException
	{
		coffee.additemtocart();
	}
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
}

