//Defines the capabilities and the test case used.

package testsuite;

import org.testng.Reporter;
import org.testng.annotations.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import screen.*;

import org.openqa.selenium.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestSuite {
	AppiumDriver driver;

    public TestSuite() {
    }

    @BeforeSuite
    public void startServer() {
        Runtime runtime = Runtime.getRuntime();

        try {
            runtime.exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723 --session-override -dc \"{\"\"noReset\"\": \"\"false\"\"}\"\"");
            Thread.sleep(10000L);
        } catch (InterruptedException | IOException var3) {
            var3.printStackTrace();
        }

    }

    @BeforeMethod
    public void capabilitiesGallery() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appActivity", "io.flutter.demo.gallery.MainActivity");
        capabilities.setCapability("appPackage", "io.flutter.demo.gallery");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("fullReset", "false");
        this.driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        this.driver.manage().timeouts().implicitlyWait(180L, TimeUnit.SECONDS);
        System.out.println(this.driver.getPageSource());
    }

    @Test(
        priority = 1
    )
    public void checkMethod() throws InterruptedException {
    	
    	
    	Actions a = new Actions(driver);
    	HomeScreen.getShrine(driver).click();
    	LoginScreen.getUsername(driver).click();
    	a.sendKeys("abc").perform();
    	LoginScreenEnter.getPassword(driver).click();
    	a.sendKeys("pass").perform();
    	Thread.sleep(5000);
    	LoginScreen.getNextButton(driver).click();
    	AfterLoginScreen.getHamburger(driver).click();
    	HamburgerOptionScreen.getClothing(driver).click();
 	TouchAction touchAction = new TouchAction(driver);
  	touchAction.press(PointOption.point(849, 1159)).moveTo(PointOption.point(-500, 0)).release().perform();
System.out.println("Swipe successfull");

touchAction.press(PointOption.point(849, 1159)).moveTo(PointOption.point(55, 1055)).release().perform();
System.out.println("Swipe successfull");

//    	
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//    	HashMap<String, String> scrollObject = new HashMap<String, String>();
//    	scrollObject.put("direction", "left");
//    	js.executeScript("mobile: scroll", scrollObject);
    }
    
    @AfterMethod
	public void closeAppAndDriver()
	{
		driver.closeApp();
		driver.quit();
	}
	@AfterSuite
	public void stopAppiumServer()
	{
        try 
        {
            Runtime.getRuntime().exec("taskkill /F /IM node.exe");
            Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
        } 
        catch (IOException e)
        {
            Reporter.log(e.getMessage());
        }
    }
}
