import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/irish/Downloads/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/maps");

        WebElement autocomplete = driver.findElement(By.id("searchboxinput"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        Thread.sleep(1000);

        WebElement autocompleteResult = driver.findElement(By.className("DgCNMb"));
        autocompleteResult.click();
        
        driver.quit();
    }
}
