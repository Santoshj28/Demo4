package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(id="email")
	WebElement username;

	@FindBy(id="password")
	WebElement password;

	@FindBy(xpath="//button")
	WebElement loginBtn;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}
}
