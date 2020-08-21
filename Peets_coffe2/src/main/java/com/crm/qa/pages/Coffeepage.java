package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Util.testutil;
import com.qa.base.testbase;

public class Coffeepage extends testbase
{
	public Actions action;
	public Select select;
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	@FindBy(id="shop-header-link")
	WebElement shophover;
	
	@FindBy(xpath="//a[contains(text(),'Shop Coffee')]")
	WebElement shpcoffelnk;
	
	@FindBy (xpath="//span[@class=\"link-text\" and contains(text(),\"Coffee\")]")
	WebElement coffeeitem;
	
	@FindBy (xpath="//a[@title=\"Organic French Roast\" and @tabindex=\"0\"]")
	WebElement itemtocart;
	
	@FindBy(xpath="//button[@class='button btn-cart btn-dark' and contains(text(),'Add To Cart')]")
	WebElement clickoncart;
	
	@FindBy(xpath="//*[@id=\"qinputplus-12725\"]")
	WebElement plus;
	
	@FindBy(xpath="//*[@id=\"qinputminus-12725\"]")
	WebElement minus;
	
	
	@FindBy(xpath="//*[@class='thumb-link']")
	WebElement thumblink;
	
	@FindBy(xpath="//a[@class=\"cart-link underlined-link\" and contains(text(),'View Cart')]")
	WebElement verifycart;
	
	public Coffeepage()
	{
		PageFactory.initElements(driver,this);
	}
	public shopcoffee searchitem() 
	{
		shophover.click();
		return new shopcoffee();
		//Thread.sleep(2000);
	}
	public void openPDPpage() throws InterruptedException
	{
		shophover.click();
		shpcoffelnk.click();
		//action.moveToElement(shophover).build().perform();
		Thread.sleep(3000);
		//coffeeitem.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",itemtocart);
		Thread.sleep(3000);
		thumblink.click();
	}
	
	public void increseanddescreseqty() throws InterruptedException
	{
		shophover.click();
		shpcoffelnk.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",itemtocart);
		Thread.sleep(1000);
		plus.click();
		Thread.sleep(2000);
		minus.click();
	}
	
	public void additemtocart()throws InterruptedException
	{
		shophover.click();
		shpcoffelnk.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",itemtocart);
		Thread.sleep(3000);
		//driver.manage().wait(2000);
		 select = new Select(driver.findElement(By.id("attribute198")));
		select.selectByVisibleText("Drip");
		Thread.sleep(2000);
		clickoncart.click();
		//driver.manage().wait(3000);
		verifycart.click();
	}
	
	
}
