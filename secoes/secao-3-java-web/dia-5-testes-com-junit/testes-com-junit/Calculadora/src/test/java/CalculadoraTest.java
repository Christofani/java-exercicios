import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.betrybe.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes da classe Calculadora")
public class CalculadoraTest {

  @Test
  @DisplayName("Teste do método somar")
  public void testeSomar() {
    Calculadora cal = new Calculadora();
    assertEquals(38, cal.somar(32, 6));
  }

  @Test
  @DisplayName("Teste do método sub")
  public void testeSub() {
    Calculadora cal = new Calculadora();
    assertEquals(1, cal.subtrair(3, 2));
  }

  @Test
  @DisplayName("Teste do método sub")
  public void testeDivisao() {
    Calculadora cal = new Calculadora();
    assertEquals(3, cal.dividir(6, 2));
  }

  @Test
  @DisplayName("Teste da exceção do método dividir")
  public void testedividirExcecao() {
    Calculadora cal = new Calculadora();
    assertThrows(ArithmeticException.class, () -> {
      cal.dividir(3, 0);
    });
  }
}
