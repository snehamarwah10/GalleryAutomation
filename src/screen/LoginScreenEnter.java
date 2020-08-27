//Defined the elements of the screen which comes up after username is entered using the respective locator.

package screen;

import locators.LoginScreenEnterLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class LoginScreenEnter extends LoginScreenEnterLocators{
	static AppiumDriver driver;
	public static WebElement getPassword(AppiumDriver driver)
    {
		return driver.findElement(By.xpath(password));
    }
}
