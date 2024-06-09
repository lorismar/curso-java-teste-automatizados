package curso_java_teste_automatizados.com.br.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {


@Test
void testSoma() {
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.soma(2, 3);
    assertEquals(5, resultado); // Esperado 2 + 3 = 5
}

}