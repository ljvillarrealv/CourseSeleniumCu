package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePages {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    
    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePages(WebDriver driver){

        BasePages.driver= driver;
    }
    //Navegar das
    public static void navigateTo (String url){
        driver.get(url);
    }

    private WebElement Find (String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));

    }

    public void clickElement(String locator){
        Find(locator).click();
    }
}
