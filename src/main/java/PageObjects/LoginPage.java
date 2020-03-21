package PageObjects;

import Utilities.ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    //Identify Object And Class to WebDriver

    WebDriver driver;
    WebDriverWait wait;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);

    }

    //access to SignIn Button
    public void signIn(){
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.SignInBTNLocator));
        WebElement loginBtn = driver.findElement(ObjectRepo.SignInBTNLocator);
        loginBtn.click();
    }

    //Set Email Value
    public void loginEmail(String email){

        WebElement emailField = driver.findElement(ObjectRepo.EmailLocator);
        emailField.sendKeys(email);
    }

    //Click on Next to Get Next step password
    public void loginNextPass(){
        WebElement loginNextPassBtn = driver.findElement(ObjectRepo.NextPassLocator);
        loginNextPassBtn.click();
    }

    // Set Password Value
    public void loginPassword(String password)
    {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.PasswordLocator));
        WebElement passwordField = driver.findElement(ObjectRepo.PasswordLocator);
        passwordField.sendKeys(password);

    }

    //Click on Next to Get Next step and SignIn
    public void loginNext(){
        WebElement loginNextBtn = driver.findElement(ObjectRepo.NextLogLocator);
        loginNextBtn.click();
    }

}
