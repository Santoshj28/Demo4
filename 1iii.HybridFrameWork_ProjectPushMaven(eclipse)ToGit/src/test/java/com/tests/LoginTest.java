package com.tests;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Loginpage;

public class LoginTest extends BaseClass {

	Loginpage lp= null;

	@BeforeSuite
	public void setup()throws Exception {
		initialization();
		reportInit();
		lp= new Loginpage(driver);
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
		report.flush();
	}

	@Test
	public void passtest() {
		 lp.loginToApplication("kiran@gmail.com", "123456");
		 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
	public void failtest() {
		Assert.assertTrue(false);
	}
	@Test
	public void skiptest() {
		throw new SkipException("skipping a testcase");
	}
}
