package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Util.testutil;
import com.qa.base.testbase;

public class Locations extends testbase
{
	testutil util;

	@FindBy(xpath="//a[@id='locations-header-link']")
	WebElement locationlink;
	
	@FindBy(xpath="//a[contains(text(),'FIND A PRODUCT')]")
	WebElement findcoffebarlink;
	
	@FindBy(xpath="//*[@id=\"panel1RedrawLabelShell\"]/div[@id='brandLabelSideTop1']")
	WebElement espressocap;
	
	@FindBy(xpath="//div[@id=\"brandLabelSideTop6\"]")
	WebElement bottled;
	
	@FindBy(xpath="//div[@id=\"brandLabelSideTop4\"]")
	WebElement wholebean;
	
	@FindBy(xpath="//div[@id=\"brandLabelSideTop2\"]")
	WebElement kcup;
	
	@FindBy(xpath="//div[@id=\"brandLabelSideTop5\"]")
	WebElement tea;
	
	@FindBy(xpath="//div[@id=\"brandLabelSideTop3\"]")
	WebElement groundcoffee;
	
	@FindBy(xpath="//div[@id='panel1HoverCountNoSelShell63']")
	WebElement hoverrightmark;
	
	@FindBy(xpath="//div[@id='brandLabelSideTwo8']")
	WebElement decaf;
	
	@FindBy(xpath="//div[@id='brandLabelSideTwo7']")
	WebElement darkroast;
	
	@FindBy(xpath="//div[@id='panel1HoverCountNoSelShell64']")
	WebElement hoverrightmark1;

	public Locations()
	{
	PageFactory.initElements(driver,this);
	}
	
	public void clickonfindaproduct() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(locationlink).build().perform();
		Thread.sleep(2000);
		findcoffebarlink.click();
	}
	
	public void clickoncategories() throws InterruptedException 
	{
		Actions action=new Actions(driver);
		action.moveToElement(locationlink).build().perform();
		Thread.sleep(2000);
		try
		{
		findcoffebarlink.click();
	
		Thread.sleep(10000);
		espressocap.click();
		Thread.sleep(2000);
		bottled.click();
		Thread.sleep(2000);
		wholebean.click();
		Thread.sleep(2000);
		kcup.click();
		Thread.sleep(2000);
		tea.click();
		Thread.sleep(2000);
		groundcoffee.click();
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	public void selectmultiple() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(locationlink);
		Thread.sleep(2000);
		findcoffebarlink.click();
		Thread.sleep(1000);
		hoverrightmark.click();
		Thread.sleep(1000);
		hoverrightmark1.click();
	}
	
	public void expandespressocap() throws InterruptedException 
	{
	espressocap.click();
	Thread.sleep(1000);
	decaf.click();
	Thread.sleep(1000);
	darkroast.click();
	Thread.sleep(1000);
	espressocap.click();
	
	
	}
	
}