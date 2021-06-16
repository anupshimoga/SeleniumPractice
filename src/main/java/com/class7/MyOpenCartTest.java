package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyOpenCartTest {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.opencart.com/index.php?route=account/login");
	driver.findElement(By.id("input-email")).sendKeys("anups141988@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Test@12345");
	driver.findElement(By.xpath("//input[@value='Login' and @type='submit']")).click();
	driver.findElement(By.cssSelector("#search input")).sendKeys("MacBook");
	driver.findElement(By.cssSelector(".input-group-btn button")).click();
	driver.findElement(By.linkText("MacBook Pro")).click();
	int size = driver.findElements(By.cssSelector(".thumbnails li img")).size();
	System.out.println(size);
	//driver.quit();
	}
}
