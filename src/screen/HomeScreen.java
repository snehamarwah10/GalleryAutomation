//Defined the elements of the home screen using the respective locator.

package screen;

import locators.HomeScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class HomeScreen extends HomeScreenLocators {
	static AppiumDriver driver;
	public static WebElement getShrine(AppiumDriver driver)
    {
		return driver.findElement(By.xpath(shrine));
    }
}
