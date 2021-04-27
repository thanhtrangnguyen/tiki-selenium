package tiki.Page;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TikiPageObject {
    String Email="thanhhuongkt94@gmail.com", Pass="933548",Wrongpass="123456";
    WebDriver driver;
    @BeforeClass
    public static void PreAll()
    {
        System.setProperty("webdriver.chrome.driver","./src/driver/chromedriver.exe");
    }
    @Before
    public void PreCondition()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tiki.vn/");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    }
    @Test
    public void LogInPass()
    {
    HomePage.ClickonLinkDropDown(driver);
    HomePage.ClickonLogInLink(driver);
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    LogInPage.EnterUsername(driver,Email,Pass);
    LogInPage.ClickOnLogInButton(driver);
    //check
        List logout =driver.findElements(By.xpath(HomePage.LinkLogout));
        if (logout.size()==1)
            Assert.assertEquals("Pass", true, true);
        else
            Assert.assertEquals("Fail", false, true);
    }
    @Test
    public void LogInFail()
    {
        HomePage.ClickonLinkDropDown(driver);
        HomePage.ClickonLogInLink(driver);
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        LogInPage.EnterUsername(driver,Email,Wrongpass);
        LogInPage.ClickOnLogInButton(driver);
        //check
        List logout =driver.findElements(By.xpath(HomePage.LinkLogout));
        if (logout.size()==1)
            Assert.assertEquals("Pass", true, true);
        else
            Assert.assertEquals("Fail", false, true);
    }
    @After
    public void After()
    {
        drver.quit();
    }
}