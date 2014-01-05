import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import java.util.concurrent.TimeUnit;

/**
 * Created by Sharma on 1/4/14.
 */
public class Base
{
    public static WebDriver driver = new FirefoxDriver();





    public void clickByXpath(String locator)
    {
        driver.findElement(By.xpath(locator)).click();
    }
    public void typeByXpath(String locator, String value)
    {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

}
