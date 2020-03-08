package PageObjects;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCuota {
    Faker faker = new Faker();
    int valorCredito = faker.number().numberBetween(15000000,999999999);
    int plazoCreditoCuota = faker.number().randomDigit();

    @FindBy(id = "cuota")
    WebElement labelCuota;

    @FindBy(id = "credito")
    WebElement fieldCredito;

    @FindBy(id = "plazocuotas")
    WebElement fieldPlazoCuotas;

    @FindBy(id = "calcular")
    WebElement ButtonCalcularCuotas;


    public void irACuota() {
        labelCuota.click();
    }
    public void digitePlazo(int plazoCreditoCuota) {
        fieldCredito.sendKeys();
    }

    public void digiteValorCredito(int valorCredito) {
        fieldPlazoCuotas.sendKeys("10");
    }

    public void calcularCuota() {
        ButtonCalcularCuotas.click();
    }

    public PaginaCuota(WebDriver driver){
        PageFactory.initElements(driver,this);

    }


    public void PaginaCuota(WebDriver driver){
        PageFactory.initElements(driver,this);


    }

}

