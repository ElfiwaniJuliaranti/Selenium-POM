package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
    public static String hamburgerMenu = "//*[@id=\"react-burger-menu-btn\"]";
    public static String closeButton = "//*[@id=\"react-burger-cross-btn\"]";
    public static String allItemsMenu = "//*[@id=\"inventory_sidebar_link\"]";
    public static String aboutMenu = "//*[@id=\"about_sidebar_link\"]";
    public static String logoutMenu = "//*[@id=\"logout_sidebar_link\"]";

    public static void clickHamburgerMenu(){
        driver.findElement(By.xpath(hamburgerMenu)).click();
    }

    public static void clickCloseButton(){
        driver.findElement(By.xpath(closeButton)).click();
    }
    public static void clickAllItemsMenu(){
        driver.findElement(By.xpath(allItemsMenu)).click();
    }
    public static void clickAboutMenu(){
        driver.findElement(By.xpath(aboutMenu)).click();
    }
    public static void clickLogoutMenu(){
        driver.findElement(By.xpath(logoutMenu)).click();
    }
}
