package tiki.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage
{
    public  static String username="//input[@id='email']";
    public  static String password ="//input[@id='password']";
    ////button[1][contains(.,'Đăng nhập')]
    public  static String LogInButton="//form//button[.='Đăng nhập']";
    public static void EnterUsername (WebDriver driver, String Email,String Pass)
    {
        driver.findElement(By.xpath(username)).sendKeys(Email);
        driver.findElement(By.xpath(password)).sendKeys(Pass);
    }
    public static void ClickOnLogInButton (WebDriver driver)
    {
        driver.findElement(By.xpath(LogInButton)).click();
    }
}