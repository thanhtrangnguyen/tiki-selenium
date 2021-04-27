package tiki.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public static String LinkDropdown="//span/span[contains(.,'Đăng Nhập / Đăng Ký')]";
    public  static String LinkLogin="//button[text()='Đăng nhập']";
    public static String LinkLogout="//span/span[contains(.,'Tài Khoản')]";
    public static void ClickonLinkDropDown(WebDriver driver)
    {
        driver.findElement(By.xpath(LinkDropdown)).click();
    }
    public static void ClickonLogInLink(WebDriver driver)
    {
        driver.findElement(By.xpath(LinkLogin)).click();
    }
}