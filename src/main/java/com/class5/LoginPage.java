package com.class5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		
		driver.get("https://login.globalglaze.in/");
		
		Utility utility = new Utility(driver);
		
		
		By email = By.id("ctl00_ContentPlaceHolder1_usernm");
		utility.explicitWait(email, 2);
		By password = By.id("adminpassword");
		By submitButton = By.id("ctl00_ContentPlaceHolder1_btn_go");

		utility.doSendkeys(email, "anup");
		utility.doSendkeys(password, "123");
		utility.doClick(submitButton);
	}

}
