package tests;

import PageObjects.PaginaCuota;
import PageObjects.PaginaPrestamo;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite{
      protected WebDriver firefoxDriver;
      protected PaginaPrestamo paginaPrestamo;
      protected PaginaCuota paginaCuota;

     private void inicializarPaginas(WebDriver driver){
         paginaPrestamo = new PaginaPrestamo(firefoxDriver);
     }


    @Before
    public void abrirDriver(){
        firefoxDriver.get("https://www.metrocuadrado.com/calculadora-credito-hipotecario-vivienda/");
        System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
        FirefoxOptions options=new FirefoxOptions();
        options.setCapability("marionette",false);
        firefoxDriver=new FirefoxDriver(options);
        firefoxDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        inicializarPaginas(firefoxDriver);
        }
    @After
    public void cerrarDriver(){
    //cerrar ventana/ apagar driver
    firefoxDriver.quit();
        }
   }

