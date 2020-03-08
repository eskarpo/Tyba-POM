package PageObjects;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrestamo {

    Faker faker = new Faker();
    int valor = faker.number().numberBetween(737900,999999999);
    int plazoCredito = faker.number().randomDigit();

    @FindBy(id ="prestamo")
     WebElement labelPrestamo;

    @FindBy(id = "ingresos")
    WebElement fieldIngresos;

    @FindBy(id = "plazoingresos")
    WebElement fieldPlazoIngresos;

    @FindBy(id = "calcularIngresos")
    WebElement ButtonCalcularIngresos;

    public void irAPrestamo() {
        labelPrestamo.click();
    }
    public void digitePlazoPrestamo(int plazoCredito) {
        fieldPlazoIngresos.sendKeys();
    }

    public void digiteIngresos(int valor) {
        fieldIngresos.sendKeys();
    }

    public void calcularPrestamo(){
        ButtonCalcularIngresos.click();
    }

    public PaginaPrestamo(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



}
