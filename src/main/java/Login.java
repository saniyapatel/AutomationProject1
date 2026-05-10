import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // adding new changes here
        driver.get("https://demoqa.com/webtables");

        System.out.println("for testing");
        //assertion for Web Tables text
        String expectedText = "Web Tables";
        WebElement actualText1 = driver.findElement(By.xpath("//h1[contains(text(),Web)]"));
        String actualText = actualText1.getText();
        Assert.assertEquals(expectedText,actualText);

        System.out.println("testing if the jenkins setup is correct");
        // adding new change from another account
        driver.quit();
    }
}
