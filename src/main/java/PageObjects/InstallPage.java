package PageObjects;

import Utilities.ObjectRepo;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class InstallPage {

    WebDriver driver;
    WebDriverWait wait;

    public InstallPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    //Start to Install App and Click opn install Button
    public void InstallBTN() throws InterruptedException {
        WebElement installBTN = driver.findElement(ObjectRepo.InstallBTNLocator);
        installBTN.click();
        Thread.sleep(10000);
        //Iframe Switch to get Install Locator
        List<WebElement> elements = driver.findElements(By.tagName("iframe"));
        driver.switchTo().frame(elements.get(2));
        WebElement installConlBTN = driver.findElement(ObjectRepo.InstallConLocator);
        installConlBTN.click();
        driver.switchTo().defaultContent();
    }

    //Verify Button to continue to Can Install App
    public void VerifyBTN()
    {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.VerifyNextBTNLocator));
        WebElement elmemusPageBtn = driver.findElement(ObjectRepo.VerifyNextBTNLocator);
        elmemusPageBtn.click();
    }

    //Verify Password to can continue Install
    public void VerifyPassword(String password)
    {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.VerifyPasswordLocator));
        WebElement passwordField = driver.findElement(ObjectRepo.VerifyPasswordLocator);
        passwordField.sendKeys(password);

        WebElement loginNextBtn = driver.findElement(ObjectRepo.VerifyNextLogLocator);
        loginNextBtn.click();

    }

    //verify install App
    public void VerifyOkBTN() throws InterruptedException {
        Thread.sleep(10000);
        //Iframe Switch to get Verify Ok Locator
        List<WebElement> elements = driver.findElements(By.tagName("iframe"));
        driver.switchTo().frame(elements.get(2));
        WebElement verifyOkBTN = driver.findElement(ObjectRepo.VerifyOkBTNLocator);
        verifyOkBTN.click();
        driver.switchTo().defaultContent();
    }

}
