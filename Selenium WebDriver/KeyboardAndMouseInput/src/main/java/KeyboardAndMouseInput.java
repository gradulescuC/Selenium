import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/gradulescu/Desktop/SeleniumWebDriver/chromedriver"); // set the path of chromedriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.id("name"));
        Thread.sleep(2000);
        name.click();
        Thread.sleep(2000);
        name.sendKeys("Meaghan  Lewis");
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.id("button"));
        Thread.sleep(2000);
        button.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
