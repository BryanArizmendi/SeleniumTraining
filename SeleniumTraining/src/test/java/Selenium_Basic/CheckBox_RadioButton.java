package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBox_RadioButton
{
    private WebDriver driver;
    @BeforeTest
    public void Setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        driver.manage().deleteAllCookies();
        Thread.sleep(3000);

    }

    //Validar:
    //1.Verificar que se muestre el elemento con el cual vamos a interactuar, antes de cualquier operacion
    //2. Verificar que los radio button o check box esten habilitados
    //3. verificar que la seleccion predeterminada del boton, ya sea radio o check

    @Test
    public void CkeckAndRadio() throws InterruptedException {
        WebElement radioButtonMale = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));

        //isDisplayed(): lo que regresa es un valor booleano, si devuelve verdadero, entonces dicho boton
        //esta presente, si es falso entonces el boton no se encuentra

        //isEnabled(): lo que nos regresa es un valor booleano, si devuelve verdadero. entonces
        //el boton esta habilitado, si regresa falso, entonces el boton no esta presente

        //isSelected(): lo que nos regresa es un valor booleano, si devuelve verdadero, entonces
        //el boton esta seleccionado, si regresa falso, el boton no esta presente

        boolean statusDisplayed = radioButtonMale.isDisplayed();
        Thread.sleep(3000);
        boolean statusEnabled = radioButtonMale.isEnabled();
        Thread.sleep(3000);
        boolean statusSelected = radioButtonMale.isSelected();

        System.out.println("Status displayed: " + statusDisplayed);
        System.out.println("Status Enabled: " + statusEnabled);
        System.out.println("Status Selected: " + statusSelected);
        //radioButtonMale.click();
        Thread.sleep(3000);
    }



        @AfterTest
        public void TearDown()
        {

            driver.close();

            driver.quit();
        }

    }


