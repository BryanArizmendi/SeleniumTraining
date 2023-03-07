package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locators
{
    private WebDriver driver;
    @BeforeTest
    public void Setup() throws InterruptedException {
        //SE coloca la direccion del driver, segun corresponda
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");

        //Se crea la instancia u objeto del navegador
        driver = new ChromeDriver();

        //Maximiza el navegador
        driver.manage().window().maximize();

        //Enviamos la URL al navegador
        driver.get("http://demo.guru99.com/test/newtours");
        driver.manage().deleteAllCookies();
        Thread.sleep(6000);


    }

    @Test
    public void MiPrimerTest() throws InterruptedException
    {
        //Localizador por ID
        /*WebElement demoSite = driver.findElement(By.id("site-name"));
        demoSite.click();
        Thread.sleep(3000);

         */

        //Localizador por user name
        /*WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("Automation23");
        Thread.sleep(3000);

         */

        //Localizador por clase
        /*WebElement logo = driver.findElement(By.className("logo"));
        logo.click();
        Thread.sleep(3000);

         */

        //Localizador por linktext

        /*WebElement demoSite = driver.findElement(By.linkText("Demo Site"));
        demoSite.click();
        Thread.sleep(3000);

         */

        //Localizador por partial linktext
        /*WebElement demoSite = driver.findElement(By.partialLinkText("Demo"));
        demoSite.click();
        Thread.sleep(3000);

         */

        //*******Localizador por cssSelector********
        //WebElement userName = driver.findElement(By.cssSelector("input[name='userName']"));
        //WebElement demoSite = driver.findElement(By.cssSelector("div#site-name"));
       // WebElement demoSite = driver.findElement(By.cssSelector("#site-name"));
        //demoSite.click();

        /*WebElement userName = driver.findElement(By.cssSelector("input[type='text'][name='userName']"));
        userName.sendKeys("Automation");
        Thread.sleep(3000);

         */

        //******** X P H A T S ***********
        //Existen dos tipos de xphats; absoluto y relativo
        //El xphat absoluto por buenas practicas NO se debe utilizar o bien no abusar de el
        // **Diferencias**
        //EL xphat absoluto es toda la ruta del elemento , es decir la ubicacion el mesmo y su sintaxis inicia con una diagonal

        //********* Xphat Absoluto
        /*WebElement userName = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
        userName.sendKeys(("Locura"));
        Thread.sleep(3000);

         */

        //******** Xphat relativo*******
        //El uso de xphat relativo inivian con doble fiagonal
        //El uso de xphat relativo por medio de los tags y atributos, entiende que tags, son span. img. button. input...

        //1. Un atributo
        /*WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
        userName.sendKeys("Registro");
        Thread.sleep(3000);

         */

        //2. Dos atributos
        /*WebElement demoSite = driver.findElement(By.xpath("//a[@title='Home' and @style='front-size32px;']"));
                demoSite.click();
        Thread.sleep(3000);

         */

        //3. Uso de xphat "contains", con * o tag, se puede usar uno u otro
        WebElement demoSite = driver.findElement(By.xpath("//*[contains(text(),'Demo Site')]"));
        demoSite.click();


    }

    @AfterTest
    public void TearDown()
    {
        //Cierra el navegador
        driver.close();
        //Para cerrar instancia del chrome,desde administrador de tareas
        driver.quit();
    }

}
