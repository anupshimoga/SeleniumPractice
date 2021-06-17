package com.selenium.allclass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BAlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
//		WebElement pwdLink = driver.findElement(By.linkText("Forgot Password?"));
//		pwdLink.click();
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().back();
		
		WebElement signInButton  = driver.findElement(By.name("proceed"));
		signInButton.click();
		
		//Handling Alert
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		System.out.println(alertText);
		
		//File Uploading
		
		driver.navigate().to("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		WebElement fileUploadButton = driver.findElement(By.id("myFile"));
		fileUploadButton.sendKeys("C:\\Users\\cjdlw0\\Desktop\\a.txt");
		
		//Window Pop Up
		
		driver.navigate().to("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		WebElement folTwitr = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a"));
		folTwitr.click();
		Thread.sleep(3000);
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> iterator = handle.iterator();
		String parentWID = iterator.next();
		String childWID = iterator.next();
		driver.switchTo().window(childWID);
		String title = driver.switchTo().window(childWID).getTitle();
		System.out.println(title + "This is child");
		driver.close();
		driver.switchTo().window(parentWID);
		String title1 = driver.switchTo().window(parentWID).getTitle();
		System.out.println(title1 + "This is parent");
	}
}
