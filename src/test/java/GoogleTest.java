import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void testSearch() throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        WebElement textBox = driver.findElement(By.name("q"));

        textBox.sendKeys("selenium\n");


//        WebElement button = driver.findElement(By.name("btnK"));
//        button.click();
        WebElement text = driver.findElement(By.xpath("//h3[text() = 'Selenium']"));
        Assert.assertEquals(text.getText(),"Selenium");
        driver.quit();

    }
}
