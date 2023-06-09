import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class SeleniumFirstTest extends BaseTest {

    @Test
    public void testFirst() throws InterruptedException {

        getDriver().get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = getDriver().getTitle();
        assertEquals("Web form", title);

        WebElement textBox = getDriver().findElement(By.name("my-text"));
        WebElement submitButton = getDriver().findElement(By.cssSelector("button"));
        Thread.sleep(2000);
        textBox.sendKeys("Selenium");
        submitButton.click();
        Thread.sleep(2000);

        WebElement message = getDriver().findElement(By.id("message"));
        String value = message.getText();

        assertEquals("Received!", value);
    }
}
