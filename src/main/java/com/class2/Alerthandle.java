package com.class2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.findElement(By.xpath("/html/body/button")).click();
		Alert alert  = driver.switchTo().alert();
		String text = alert.getText();
		if(text.equals("Press a button!")) {
			System.out.println("Match!!");
		}
		alert.accept();
		
	}
}
