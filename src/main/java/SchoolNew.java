import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SchoolNew {

        public static void main(String[] args){
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.w3schools.com/html/html_tables.asp");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            By tableBody = By.xpath("//tbody//tr//th[text()='Company']");
            wait.until(ExpectedConditions.visibilityOfElementLocated(tableBody));
            
        }
    }


