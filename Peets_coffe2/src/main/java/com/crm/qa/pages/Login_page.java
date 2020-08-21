package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.j2objc.annotations.ObjectiveCName;
import com.qa.base.testbase;

public class Login_page extends testbase
{
//pagefactory
	
	@FindBy(xpath="//div[@class=\"account-holder\"]/a[contains(text(),'Sign In')]")
	WebElement mainlgn;
	
	@FindBy(xpath ="//*[@id=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"send2\"]")
	WebElement loginbtn;
	
	@FindBy(xpath="//button[@class=\"button btn-dark\" and @type=\"button\"]")
	WebElement signupbtn;
	
	@FindBy(xpath="//a[@class=\"logo\"]")
	WebElement titlelogo;
	
	@FindBy(xpath="//*[@id=\"svg-close-button\"]")
	WebElement closebtn;
	
	public Login_page()  //constructor
	{
		PageFactory.initElements(driver,this);//how will you initialize pagefactory by using initElements
		//this is pointing to current page object
		
	}
	
	public String validateloginpagetitle() {
		
		return	driver.getTitle();
	}
	
	public boolean validatelogo()
	{
		return titlelogo.isDisplayed();
	}
	
	public Homepage login(String un, String pwd) throws InterruptedException
	{
		mainlgn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(10000);
		loginbtn.click();
		
		return new Homepage();
	}
}
