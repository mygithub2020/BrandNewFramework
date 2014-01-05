import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sharma on 1/4/14.
 */
public class Base
{
    public static WebDriver driver = null;
    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        //driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // driver.navigate().to("http://www.craigslist.com");
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
