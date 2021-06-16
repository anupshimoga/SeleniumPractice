package com.class2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.partialLinkText("Follow On Twitter")).click();
		Set<String> windowIds= driver.getWindowHandles();
		Iterator<String> it = windowIds.iterator();
		String parentHandle = it.next();
		String childHandle = it.next();
		driver.switchTo().window(childHandle);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentHandle);
		System.out.println(driver.getCurrentUrl());
	}
}
