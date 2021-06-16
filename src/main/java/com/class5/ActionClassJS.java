package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassJS {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.globalglaze.in/");
		
		
		WebElement email = driver.findElement(By.id("ctl00_ContentPlaceHolder1_usernm"));
		//WebElement emailButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div[2]/div/div/div/div/div/button"));
		WebElement password = driver.findElement(By.id("adminpassword"));
		WebElement submitButton = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_go"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		//action.click(emailButton).build().perform();
		action.sendKeys(email, "anups141988@gmail.com").build().perform();
		action.sendKeys(password, "test123").build().perform();
		action.click(submitButton).build().perform();
	}
}
