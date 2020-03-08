import org.junit.Assert;
import org.junit.Test;
import tests.BaseTestSuite;




public class PruebaTest extends BaseTestSuite {

    @Test
    public void Consultar_Cuanto_Te_Prestan() {
        int valor = 0;
        int plazoCredito = 0;
        paginaPrestamo.irAPrestamo();
        paginaPrestamo.digiteIngresos(valor);
        paginaPrestamo.digitePlazoPrestamo(plazoCredito);
        paginaPrestamo.calcularPrestamo();
        Assert.assertNotNull();
    }


    @Test
    public void Consultar_Valor_Cuotas(){
            int valorCredito = 0;
            int plazoCreditoCuota = 0;
        paginaCuota.irACuota();
        paginaCuota.digiteValorCredito(valorCredito);
        paginaCuota.digitePlazo(plazoCreditoCuota);
        paginaCuota.calcularCuota();
        }
}
