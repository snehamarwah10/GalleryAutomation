//Defined the elements of the login screen using the respective locator.

package screen;

import locators.LoginScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class LoginScreen extends LoginScreenLocators {
	static AppiumDriver driver;
	public static WebElement getUsername(AppiumDriver driver)
    {
		return driver.findElement(By.xpath(username));
    }
	
	public static WebElement getNextButton(AppiumDriver driver)
    {
		return driver.findElement(By.xpath(nextButton));
    }
}
