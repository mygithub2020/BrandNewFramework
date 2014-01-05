
/**
 * Created by Sharma on 1/5/14.
 */
//import qa.Base;
public class CnnBase extends Base
{
    public static String cnnUrl = "http://www.cnn.com/";

    public static String logInConfirmationText = "mycnn2014's profile";
    public static String logOutConfirmationText = "Log in";

    //Login Information
    public static String cnnLogIn = "andwhat08@gmail.com";
    public static String cnPswd = "mycnn1234";

    //links xpath
    public static String cnnLogInLink = ".//*[@id='hdr-auth']/ul/li[2]/a";

    //tabs link xpath
    public static String tvVideoTab = ".//*[@id='nav-video']/span";
    public static String cnnTrendsTab = ".//*[@id='nav-trends']/span";
    public static String usTab = ".//*[@id='nav-us']/span";
    public static String worldTab = ".//*[@id='nav-world']/span";
    public static String politicsTab = ".//*[@id='nav-politics']/span";
    public static String justiceTab = ".//*[@id='nav-justice']/span";





    //buttons xpath
    public static String popUpLogInButton = ".//*[@id='cnnConnectFormLogin']/div[1]/div/a";
    public static String cnnLogInButton = ".//*[@id='cnnConnectFormLogin']/div[1]/a";
    public static String cnnLogOutButton = ".//*[@id='hdr-auth']/ul/li[2]/a";

    //input box xpath
    public static String emailInputCnn = ".//*[@id='cnnOverlayEmail1l']";
    public static String pswdInputCnn = ".//*[@id='cnnOverlayPwd']";
    public static String logInCheckBox = ".//*[@id='cnnRememberMe']";

    //text
    public static String logInConfirmation = ".//*[@id='hdr-auth']/ul/li[1]/a";


}
