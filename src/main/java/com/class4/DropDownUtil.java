package com.class4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

	public static void selectDropDown(WebElement dropDown, String data) {
		Select select = new Select(dropDown);
		select.selectByVisibleText(data);
	}

	public static ArrayList<String> getAllDropDown(WebElement dropDown) {
		Select select = new Select(dropDown); 
		List<WebElement> allOptions = select.getOptions();
		ArrayList<String> ar = new ArrayList<String>();
		for (int i = 0; i < allOptions.size(); i++) {
			String getText = allOptions.get(i).getText();
			ar.add(getText);
		}
		return ar;
	}

	public static void dropdownWithoutSelectClass(String input1, List<WebElement> input) {

		for (int i = 0; i < input.size(); i++) {
			String text = input.get(i).getText();
			// System.out.println(text);
			if (text.equals(input1)) {
				input.get(i).click();
				break;
			}
		}
	}

}
