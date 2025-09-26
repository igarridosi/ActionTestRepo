
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.Calculadora;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void testSumar() {
        // Esta prueba debería pasar
        assertEquals(5, calculadora.sumar(2, 3), "La suma de 2 y 3 debería ser 5");
    }

    @Test
    void testRestar() {
        // Esta prueba debería fallar
        assertEquals(2, calculadora.restar(5, 3), "La resta de 5 y 3 debería ser 2");
    }
}