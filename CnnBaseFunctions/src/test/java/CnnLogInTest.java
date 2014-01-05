import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.lang.InterruptedException;

/**
 * Created by Sharma on 1/5/14.
 */
public class CnnLogInTest extends CnnBase
{
    @BeforeClass(dependsOnMethods = {"setUp"})
    private void go_to_Cnnsite() throws InterruptedException
    {
        //Base.driver.navigate().to(siteUrl);
        driver.navigate().to(cnnUrl);
        Thread.sleep(5000);
    }

    @Test
    public void cnnLogIn_Test() throws InterruptedException
    {
        clickByXpath(".//*[@id='hdr-prompt-close']");

        Set<String> listOfWindow = driver.getWindowHandles();
        Iterator it = listOfWindow.iterator();
        String homeWindow = driver.getWindowHandle();
        clickByXpath(".//*[@id='hdr-auth']/ul/li[2]/a");
        listOfWindow = driver.getWindowHandles();
        it = listOfWindow.iterator();
        String popUpWindow1 = (String) it.next();
        driver.switchTo().window(popUpWindow1);
        clickByXpath(CnnBase.popUpLogInButton);
        listOfWindow = driver.getWindowHandles();
        it = listOfWindow.iterator();
        String popUpWindow2 = (String) it.next();
        driver.switchTo().window(popUpWindow2);
        typeByXpath(CnnBase.emailInputCnn, CnnBase.cnnLogIn);
        typeByXpath(CnnBase.pswdInputCnn, CnnBase.cnPswd);
        clickByXpath(CnnBase.logInCheckBox);
        clickByXpath(CnnBase.cnnLogInButton);
        driver.switchTo().window(homeWindow);
        Thread.sleep(4000);

        //String displayed_Cnn_ScreenName = driver.findElement(By.xpath(CnnBase.logInConfirmation)).getText();
        //Assert.assertEquals(displayed_Cnn_ScreenName, CnnBase.logInConfirmationText);

        clickByXpath(CnnBase.cnnLogOutButton);
        //String displayLogInLink = driver.findElement(By.xpath(CnnBase.cnnLogInLink)).getText();
        //Assert.assertEquals(displayLogInLink, CnnBase.logOutConfirmationText);


        driver.quit();


    }
}
