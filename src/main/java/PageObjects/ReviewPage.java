package PageObjects;

import Utilities.ObjectRepo;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReviewPage {

        WebDriver driver;
        WebDriverWait wait;

        public ReviewPage(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(this.driver, 30);
        }

    public void ReviewBTN()
    {
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.WritereviewBTNLocator));
        WebElement reviewBtn = driver.findElement(ObjectRepo.WritereviewBTNLocator);
        reviewBtn.click();
    }

    public void WriteReview() throws InterruptedException {
        Thread.sleep(10000);
        List<WebElement> elements = driver.findElements(By.tagName("iframe"));
        driver.switchTo().frame(elements.get(3));
        WebElement reviewTextField = driver.findElement(ObjectRepo.ReviewTextLocator);
        reviewTextField.sendKeys("Elmenus Review Test Mohammed Said");

        WebElement reviewStarsBtn = driver.findElement(ObjectRepo.StarsBTNLocator);
        reviewStarsBtn.click();
    }

    // Function To Take ScreenShoots
    public void ScreenShoot() {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile
            FileUtils.copyFile(src, new File("D:/el menus/ElMenus Task/ScreenShoot/review.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void WriteReviewSubmit(){

        WebElement reviewSubmitBtn = driver.findElement(ObjectRepo.ReviewSubmitBTNLocator);
        reviewSubmitBtn.click();
        driver.switchTo().defaultContent();
    }

    public void ReviewDeleteBTN()
    {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.ReviewDeleteBTNLocator));
        WebElement reviewDeleteBtn = driver.findElement(ObjectRepo.ReviewDeleteBTNLocator);
        reviewDeleteBtn.click();
    }

    public void SignOutBTN()
    {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.UserBTNLocator));
        WebElement userBtn = driver.findElement(ObjectRepo.UserBTNLocator);
        userBtn.click();

        WebElement signOutBtn = driver.findElement(ObjectRepo.SignOutBTNLocator);
        signOutBtn.click();
    }
}
