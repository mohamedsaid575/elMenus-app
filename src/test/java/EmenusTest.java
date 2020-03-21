import PageObjects.InstallPage;
import PageObjects.LoginPage;
import PageObjects.NavigatePage;
import PageObjects.ReviewPage;
import Utilities.ObjectRepo;
import Utilities.PropertiesConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

    // Identify All Objects and Classes

    public class EmenusTest {

    WebDriver driver;
    WebDriverWait wait;
    NavigatePage navigatePage;
    InstallPage installPage;
    LoginPage loginPage;
    ReviewPage reviewPage;
    PropertiesConfig propertiesConfig;
    int TimeOut = 10;

    @BeforeClass
    public void beforeclass()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, TimeOut);
        navigatePage = new NavigatePage(driver);
        installPage = new InstallPage(driver);
        loginPage = new LoginPage(driver);
        reviewPage = new ReviewPage(driver);
        propertiesConfig = new PropertiesConfig();
        driver.get(propertiesConfig.getBaseURL());
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.SignInBTNLocator));

    }

    //open Google Play Page and Navigate To Login Page
    @Test (priority = 1)
    public void navigateToLogin()
    {
        SoftAssert softAssert = new SoftAssert();

        loginPage.signIn();

        //Assert to Check login Page Open Successful
        softAssert.assertTrue(driver.getTitle().contains("Google"),"Login navigate Failed");

        softAssert.assertAll();
    }

    // Open Login Page and set Email and Password
    @Test (priority = 2)
    public void loginTest()
    {
        loginPage.loginEmail(propertiesConfig.getValidEmail());

        loginPage.loginNextPass();

        loginPage.loginPassword(propertiesConfig.getValidPassword());

        loginPage.loginNext();
    }

    //Open HomePage and Search Elmenus APP
    @Test (priority = 3)
    public void searchTest()
    {
        navigatePage.SearchText();

        navigatePage.Search();
    }

    // Open Elmenus Page and Click Add WishList
    @Test (priority = 4)
    public void wishListTest()
    {
        navigatePage.ElmemusPage();

        navigatePage.WishListAdd();
    }

    // Install Elmenus App steps
    @Test (priority = 5)
    public void installTest() throws InterruptedException {

        installPage.InstallBTN();

        installPage.VerifyBTN();

        installPage.VerifyPassword(propertiesConfig.getValidPassword());

        installPage.VerifyOkBTN();
    }

    // Review Elmenus After Install and Take ScreenShoot Then Delete Review then SignOut
    @Test (priority = 6)
    public void reviewTest() throws InterruptedException {

        reviewPage.ReviewBTN();

        reviewPage.WriteReview();

        reviewPage.ScreenShoot();

        reviewPage.WriteReviewSubmit();

        reviewPage.ReviewDeleteBTN();

        reviewPage.SignOutBTN();
    }

}
