package com.class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.class5.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleChoices {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
//		driver.findElement(By.id("justAnInputBox")).click();
//		Utility.choiceCheck(driver, "All");	
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rowCount = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size()-1;
		System.out.println(rowCount);
		String prefiXpath = "//*[@id='customers']/tbody/tr[";
		String suffiXpath = "]/td[1]";
		
		for(int midXpath=2; midXpath<=rowCount+1; midXpath++) {
			String finalXpath = prefiXpath +midXpath +suffiXpath;
			System.out.println(finalXpath);
			String innerText = driver.findElement(By.xpath(finalXpath)).getText();
			System.out.println(innerText);
		}
		
		
	}
}
