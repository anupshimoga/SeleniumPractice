package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("/html/body/button")).sendKeys("D:\\Training Materials\\1.jpeg");
	}
}
