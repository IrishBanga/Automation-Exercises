import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/irish/Downloads/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu= driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        WebElement automCompleteItem= driver.findElement(By.id("autocomplete"));
        automCompleteItem.click();
        

        driver.quit();
    }
}
