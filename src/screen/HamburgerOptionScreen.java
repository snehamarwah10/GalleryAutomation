//Defined the elements of the screen which comes up after selecting the hamburger option using the respective locator.

package screen;

import locators.HamburgerOptionScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class HamburgerOptionScreen extends HamburgerOptionScreenLocators {
	static AppiumDriver driver;
	public static WebElement getClothing(AppiumDriver driver)
    {
		return driver.findElement(By.xpath(clothing));
    }
}
