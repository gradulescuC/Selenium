import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseCurrentWindow {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/gradulescu/Desktop/SeleniumWebDriver/chromedriver"); // set the path of chromedriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        String originalHandle = driver.getWindowHandle();
        for(String handle1:driver.getWindowHandles()){

            driver.switchTo().window(handle1);

        }
        Thread.sleep(5000);
        driver.close();
    }

}

