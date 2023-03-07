package Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DroopDown
{
    private WebDriver driver;
    @BeforeTest
    public void Setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        driver.manage().deleteAllCookies();
        Thread.sleep(3000);

    }
    @Test
    public void DroopDownWhitClick()
    {
        //NO SE RECOMIENDA
    }

}
