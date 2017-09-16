import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class demowork {




    @Test
    public void click()
    {
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String a = driver.findElement(By.xpath(".//*[@class='header_user_info']/a[@class='login']")).getText();
        System.out.println(a);
        driver.findElement(By.xpath(".//*[@class='header_user_info']/a[@class='login']")).click();
    }
}
