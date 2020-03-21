package PageObjects;

import Utilities.ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigatePage {

    //Identify Object And Class to WebDriver

    WebDriver driver;
    WebDriverWait wait;

    public NavigatePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    //Search with Elmenus Text in Search field
    public void SearchText()
    {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.SearchTextLocator));
        WebElement loginBtn = driver.findElement(ObjectRepo.SearchTextLocator);
        loginBtn.sendKeys("Elmenus");
    }

    //Search Button to Search Elmenus
    public void Search()
    {
        WebElement searchBtn = driver.findElement(ObjectRepo.SearchBTNLocator);
        searchBtn.click();
    }

    //Open Elmenus Page After Search
    public void ElmemusPage()
    {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.ElmenusIconLocator));
        WebElement elmemusPageBtn = driver.findElement(ObjectRepo.ElmenusIconLocator);
        elmemusPageBtn.click();
    }

    // Add Elmenus to WishList
    public void WishListAdd()
    {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.WishlistBTNLocator));
        WebElement wishlistBtn = driver.findElement(ObjectRepo.WishlistBTNLocator);
        wishlistBtn.click();
    }

}
