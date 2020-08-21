package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testbase;

public class Homepage extends testbase
{
	public Actions action;
	
	@FindBy(xpath="//*[@id=\"svg-close-button\"]")
	WebElement closebtn;
	
	@FindBy(id="shop-header-link")
	WebElement shopheaderlink;
	
	@FindBy(id="subscriptions-header-link")
	WebElement subscriptionsheaderlink;

	@FindBy(id="locations-header-linkk")
	WebElement locationsheaderlink;

	@FindBy(id="menu-header-link")
	WebElement menuheaderlink;
	
	@FindBy(id="rewards-header-link")
	WebElement rewardsheaderlink;
	
	@FindBy(id="learn-header-link")
	WebElement learnheaderlink;
	
	@FindBy(xpath="//div/ul/li[1]/div[1]/a/span[1]")
	WebElement coffeepage;
	
	@FindBy(xpath="//span[@class=\"link-text\" and contains(text(),\"Equipment\")]")
	WebElement equipmenthome;
	
	@FindBy(xpath="//span[@class=\"link-text\" and contains(text(),\"Tea\")]")
	WebElement teahome;
	
	@FindBy(xpath="//span[@class=\"link-text\" and contains(text(),\"Gifts\")]")
	WebElement giftshome;
	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}

	/*public void PDPpagehover() throws InterruptedException
	{
		//Actions action=new Actions(driver);
		
		action.moveToElement(shopheaderlink).build().perform();
		Thread.sleep(2000);
		
		action.moveToElement(subscriptionsheaderlink).build().perform();
		Thread.sleep(2000);
		action.moveToElement(locationsheaderlink).build().perform();
		Thread.sleep(2000);
		action.moveToElement(menuheaderlink).build().perform();
		Thread.sleep(2000);
		action.moveToElement(rewardsheaderlink).build().perform();
		Thread.sleep(2000);
		action.moveToElement(learnheaderlink).build().perform();
		Thread.sleep(2000);		
	}*/
	
	public boolean shopheaderlinkhoverdisplayed()
	{
		return shopheaderlink.isDisplayed();
	}
	
		public void shopheaderlinkhover()
	{
		action=new Actions(driver);
		action.moveToElement(shopheaderlink).build().perform();
	}
		public  Coffeepage coffeehome() throws InterruptedException
		{
			//closebtn.click();
			action=new Actions(driver);
			action.moveToElement(shopheaderlink).build().perform();
			Thread.sleep(2000);
			coffeepage.click();
			
			return new Coffeepage();
		}
		
		public  Teahomepage Teahome() throws InterruptedException
		{
			action=new Actions(driver);
			action.moveToElement(shopheaderlink).build().perform();
			Thread.sleep(2000);
			teahome.click();
			
			return new Teahomepage();
		}
		
		public  equipmentnpage Equipmenthomepage() throws InterruptedException
		{
			action=new Actions(driver);
			action.moveToElement(shopheaderlink).build().perform();
			Thread.sleep(2000);
			equipmenthome.click();
			
			return new equipmentnpage();
		}
		
		public  giftspage Giftshomepage() throws InterruptedException
		{
			action=new Actions(driver);
			action.moveToElement(shopheaderlink).build().perform();
			Thread.sleep(2000);
			giftshome.click();
			
			return new giftspage();
		}
		
		public void subscriptionsheaderlink()
		{
			action=new Actions(driver);
			action.moveToElement(subscriptionsheaderlink).build().perform();
			
		}
	
		public void locationsheaderlink()
		{
			action=new Actions(driver);
			action.moveToElement(locationsheaderlink).build().perform();
		}
		public void menuheaderlink()
		{
			action=new Actions(driver);
			action.moveToElement(menuheaderlink).build().perform();
		}
		
		public void rewardsheaderlink()
		{
			action=new Actions(driver);
			action.moveToElement(rewardsheaderlink).build().perform();
		}
		
		public void learnheaderlink()
		{
			action=new Actions(driver);
			action.moveToElement(learnheaderlink).build().perform();
		}
}
