package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.bitdegree.org/learn/best-code-editor/iframe-html-example");
//		
//		
//		driver.switchTo().frame(0);
//		WebElement iframe = driver.findElement(By.tagName("iframe"));
//		System.out.println(iframe.getText());
		
		driver.switchTo().defaultContent();
	}
}
