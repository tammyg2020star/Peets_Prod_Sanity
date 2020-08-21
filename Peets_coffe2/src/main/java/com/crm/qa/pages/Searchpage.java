package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testbase;

public class Searchpage extends testbase 
{
	public Actions action;
	
	
	@FindBy(xpath="//button[@id='skip-search']")
	WebElement mainsearch;
	
	@FindBy(xpath="//input[@id='search']")
	WebElement itemsearch;
	
	@FindBy(xpath="//a[@title=\"Kenya Peaberry\"and @tabindex=\"0\"]")
	WebElement coffee;
	
	@FindBy(xpath="//a[@title=\"Organic Breakfast Tea Bags\" and @tabindex=\"0\"]")
	WebElement  tea;
	
	public Searchpage()
	{
		PageFactory.initElements(driver,this);
	}
/*
	
	public void searchfunctionality()
	{
		action=new Actions(driver);
	}
	
	public void presenter()
	{
		
		action.sendKeys(Keys.ENTER).build().perform();  //click ener on the search item
	}
	
	public void scrolldown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)","");	
		
	}
	
	public void performmousehover(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()", element);		
	}*/
	public void scrolldown()
	{
		mainsearch.click();
		itemsearch.sendKeys("coffee");
		action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void searchcoffee() throws InterruptedException
	{
		mainsearch.click();
		itemsearch.sendKeys("coffee");
		action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",coffee);
		Thread.sleep(2000);
		
	}
	
	public void searchTea() throws InterruptedException
	{
		mainsearch.click();
		itemsearch.sendKeys("Tea");
		action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",tea);
		Thread.sleep(2000);
	}
	
}

