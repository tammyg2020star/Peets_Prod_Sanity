package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Login_page;
import com.qa.base.testbase;

public class Homepagetest extends testbase
{
	Login_page loginpage;
	Homepage homepage;
	
	public Homepagetest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		 homepage=new Homepage();
	} 
	
	@Test(priority=1)
	public void Hoveronsubscriptionsheaderlink() throws InterruptedException
	{
	 homepage.shopheaderlinkhoverdisplayed();
		
	}
	

	@Test(priority=2)
	public void Hoveronsubscriptionsheaderlinkclick() throws InterruptedException
	{
	 homepage.shopheaderlinkhover();
		
	}
	
	@Test(priority=3)
	public void Hoveronlocationsheaderlink() throws InterruptedException
	{
	 homepage.learnheaderlink();	
	}
	@Test(priority=4)
	public void Hoveronmenuheaderlink() throws InterruptedException
	{
	 homepage.menuheaderlink();	
	}
	@Test(priority=5)
	public void Hoveronrewardslink() throws InterruptedException
	{
	 homepage.rewardsheaderlink();
	}
	
	@Test(priority=6)
	public void navigatetocoffeehomepage() throws InterruptedException
	{
	 homepage.coffeehome();
	}
	
	@Test(priority=7)
	public void navigatetoteahomepage() throws InterruptedException
	{
	 homepage.Teahome();
	}
	
	@Test(priority=8)
	public void navigatetoequipmenthomepage() throws InterruptedException
	{
	 homepage.Equipmenthomepage();
	}
	
	@Test(priority=9)
	public void navigatetorewardshomepage() throws InterruptedException
	{
	 homepage.Giftshomepage();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
