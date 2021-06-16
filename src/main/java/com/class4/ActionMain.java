package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionMain {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		
		WebElement login = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		Thread.sleep(5000);
		action.moveToElement(login).build().perform();
		Thread.sleep(2000);
		WebElement memberLogin = driver.findElement(By.linkText("Member Login"));
		action.moveToElement(memberLogin).build().perform();
		Thread.sleep(2000);
		//WebElement spiceclubLogin = driver.findElement(By.linkText("SpiceClub Members"));
		driver.findElement(By.linkText("SpiceClub Members")).click();
	}
}
