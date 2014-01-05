import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.*;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sharma on 1/4/14.
 */
public class Base
{



    public static WebDriver driver = null;
    //@BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        //driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // driver.navigate().to("http://www.craigslist.com");
    }

    //using sauce labs

    @Parameters({"sauceUserName", "key", "os", "browser", "browserVersion"})
    @BeforeMethod
    public void setUp(@Optional("andwhat08") String username,
                      @Optional("e8b9504d-21fc-44ab-8760-b2a6bde11813") String key,
                      @Optional("mac") String os,
                      @Optional("firefox") String browser,
                      @Optional("19.0") String browserVersion,
                      Method method) throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        capabilities.setCapability("version", browserVersion);
        capabilities.setCapability("platform", Platform.valueOf(os));
        capabilities.setCapability("name", method.getName());
        this.driver = new RemoteWebDriver(
                new URL("http://" + username + ":" + key + "@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
       // driver.navigate().to("http://www.cnn.com");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public void clickByXpath(String locator)
    {
        driver.findElement(By.xpath(locator)).click();
    }
    public void typeByXpath(String locator, String value)
    {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

}
