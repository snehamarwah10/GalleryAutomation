//Defined the elements of the screen which comes up after login using the respective locator.

package screen;

import locators.AfterLoginScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class AfterLoginScreen extends AfterLoginScreenLocators {
	static AppiumDriver driver;
	public static WebElement getHamburger(AppiumDriver driver)
    {
		return driver.findElement(By.xpath(hamburger));
    }
}
