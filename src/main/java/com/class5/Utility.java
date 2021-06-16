package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	WebDriver driver;

	public Utility(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method is to replace find element and take the locator
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("Some Exxception");
			System.out.println(e.getMessage());
		}
		return element;
	}

	public void doSendkeys(By locator, String input) {
		try {
			getElement(locator).sendKeys(input);
		} catch (Exception e) {
			System.out.println("Some Exxception");
			System.out.println(e.getMessage());
		}

	}

	public void doClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {
			System.out.println("Some Exxception");
			System.out.println(e.getMessage());
		}

	}

	public void explicitWait(By locator, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void choiceCheck(WebDriver driver, String... choice) {
		List<WebElement> choices = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		if (!(choice[0].equalsIgnoreCase("All"))) {
			for (int i = 0; i < choices.size(); i++) {
				String choicesText = choices.get(i).getText();
				for (int k = 0; k < choice.length; k++) {
					if (choicesText.equals(choice[k])) {
						choices.get(i).click();
						break;
					}
				}
			}
		} else {
			for(int i=0;i<choices.size();i++) {
				choices.get(i).click();
			}
		}
	}
}
