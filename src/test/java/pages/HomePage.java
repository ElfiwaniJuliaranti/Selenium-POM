package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    By hamburger_menu_xpath = By.xpath("//*[@id='react-burger-menu-btn']") ;

    public void click_hamburger_menu() {
        driver.findElement(hamburger_menu_xpath).click();
    }
}
