public class formCompletionTest {

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
    public class FormCompletionTest {
        private WebDriver driver;
        private Map<String, Object> vars;
        JavascriptExecutor js;
        public void formCompletion() {
            driver = new ChromeDriver();
            js = (JavascriptExecutor) driver;
            vars = new HashMap<String, Object>();
            driver.get("https://formy-project.herokuapp.com/");
            driver.manage().window().setSize(new Dimension(1680, 954));
            driver.findElement(By.linkText("Drag and Drop")).click();
            driver.findElement(By.id("box")).click();
            driver.findElement(By.linkText("Form")).click();
            driver.findElement(By.id("first-name")).click();
            driver.findElement(By.id("first-name")).sendKeys("Gabriela");
            driver.findElement(By.id("last-name")).sendKeys("Radulescu");
            driver.findElement(By.id("job-title")).click();
            driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
            driver.findElement(By.id("radio-button-3")).click();
            driver.findElement(By.cssSelector(".input-group:nth-child(9) > .col-sm-8:nth-child(3)")).click();
            driver.findElement(By.cssSelector(".input-group:nth-child(9) > .col-sm-8:nth-child(3)")).click();
            driver.findElement(By.id("checkbox-2")).click();
            driver.findElement(By.id("select-menu")).click();
            {
                WebElement dropdown = driver.findElement(By.id("select-menu"));
                dropdown.findElement(By.xpath("//option[. = '5-9']")).click();
            }
            driver.findElement(By.id("datepicker")).click();
            driver.findElement(By.cssSelector(".today:nth-child(7)")).click();
            driver.findElement(By.linkText("Submit")).click();
            driver.quit();
        }
    }

}
