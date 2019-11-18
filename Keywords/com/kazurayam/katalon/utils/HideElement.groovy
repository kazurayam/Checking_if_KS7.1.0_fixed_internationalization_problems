package com.kazurayam.katalon.utils

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

public class HideElement {

	static void hide(TestObject testObject) {
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> elements = WebUiCommonHelper.findWebElements(testObject, 10);
		for (WebElement element : elements) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(
					"arguments[0].setAttribute('style','display: none;');",
					element);
		}
	}
}
