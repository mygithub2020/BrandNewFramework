import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Sharma on 1/5/14.
 */
public class CnnTabsTest extends CnnBase
{
    @BeforeClass(dependsOnMethods = {"setUp"})
    private void go_to_Cnnsite() throws InterruptedException
    {
        //Base.driver.navigate().to(siteUrl);
        driver.navigate().to(cnnUrl);
        Thread.sleep(5000);
    }

    @Test
    private void click_Tabs()
    {
        clickByXpath(CnnBase.tvVideoTab);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        clickByXpath(CnnBase.cnnTrendsTab);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        clickByXpath(CnnBase.usTab);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        clickByXpath(CnnBase.worldTab);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        clickByXpath(CnnBase.politicsTab);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        clickByXpath(CnnBase.justiceTab);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.quit();




    }
}
