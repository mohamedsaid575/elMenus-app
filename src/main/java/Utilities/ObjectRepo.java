package Utilities;

import org.openqa.selenium.By;

// Identify All Locator is Used in FrameWork
public class ObjectRepo {

    //Identify Locator SignIn(Email & Password)
    public static By SignInBTNLocator = By.xpath("//*[@id=\"gb_70\"]");
    public static By EmailLocator = By.xpath("//*[@id=\"identifierId\"]");
    public static By NextPassLocator = By.xpath("//*[@id=\"identifierNext\"]/span/span");
    public static By PasswordLocator = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    public static By NextLogLocator = By.xpath("//*[@id=\"passwordNext\"]/span/span");

    //Identify Locator Search
    public static By SearchTextLocator = By.xpath("//*[@id=\"gbqfq\"]");
    public static By SearchBTNLocator = By.xpath("//*[@id=\"gbqfb\"]");

    //Identify Locator Elmenus Page and WishList
    public static By ElmenusIconLocator = By.xpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz[2]/div/div[2]/div/c-wiz/c-wiz/c-wiz/div/div[2]/div[1]/c-wiz/div/div/div[2]/div/div/div[1]/div/div/div[1]/a/div");
    public static By WishlistBTNLocator = By.xpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div[1]/div/c-wiz[1]/c-wiz[1]/div/div[2]/div/div[2]/div/div[1]/c-wiz[3]/wishlist-add/button/span[1]");

    //Identify Locator Elmenus Install
    public static By InstallBTNLocator = By.xpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div[1]/div/c-wiz[1]/c-wiz[1]/div/div[2]/div/div[2]/div/div[2]/div/c-wiz/c-wiz/div/span/button");
    public static By InstallConLocator = By.xpath("/html/body/div/div/div[2]/div[3]/span/button");

    //Identify Locator Verify Install
    public static By VerifyNextBTNLocator = By.xpath("//*[@id=\"identifierNext\"]/span/span");
    public static By VerifyPasswordLocator = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    public static By VerifyNextLogLocator = By.xpath("//*[@id=\"passwordNext\"]/span/span");
    public static By VerifyOkBTNLocator = By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div/button");

    //Identify Locator Review and Delete Review
    public static By WritereviewBTNLocator = By.xpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div[1]/div/div/div[1]/div[1]/span/button/span[2]");
    public static By StarsBTNLocator = By.xpath("//*[@id=\"yDmH0d\"]/div[2]/div/div[2]/span/div/div[3]/div[2]/div[1]/span/div[5]/div\n");
    public static By ReviewTextLocator = By.xpath("//*[@id=\"yDmH0d\"]/div[2]/div/div[2]/span/div/div[3]/textarea");
    public static By ReviewSubmitBTNLocator = By.xpath("//*[@id=\"yDmH0d\"]/div[2]/div/div[2]/div[3]/div/button[2]");
    public static By ReviewDeleteBTNLocator = By.xpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div[1]/div/div/c-wiz/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/span/span/span");

    //Identify Locator SignOut
    public static By UserBTNLocator = By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[1]/div[2]/div[1]/a/span");
    public static By SignOutBTNLocator = By.xpath("//*[@id=\"gb_71\"]");



}
