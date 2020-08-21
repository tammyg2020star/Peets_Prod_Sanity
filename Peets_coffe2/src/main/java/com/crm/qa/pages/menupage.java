package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.testbase;

public class menupage extends testbase
{

	@FindBy(xpath="//*[@id=\"menu-header-link\"]")
	WebElement menuhover;
	
}
