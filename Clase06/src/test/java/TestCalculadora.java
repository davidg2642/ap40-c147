
import ap40.clase06.Calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author david
 */
public class TestCalculadora {

    @DisplayName("la suma de 2 + 2 debe ser igual a 4")
    @Test
    public void testSumar() {

        Calculadora c = new Calculadora();

        double resultado = c.sumar(2, 2);

        assertEquals(4, resultado);
    }

    @DisplayName("la resta de 2 - 2 debe ser igual a 0")
    @Test
    public void testRestar() {

        Calculadora c = new Calculadora();

        double resultado = c.restar(2, 2);

        assertEquals(0, resultado);
    }

    @DisplayName("la multiplicacion de 2 x 2 debe ser igual a 4")
    @Test
    public void testMultiplicar() {

        Calculadora c = new Calculadora();

        double resultado = c.multiplicar(2, 2);

        assertEquals(4, resultado);
    }

    @DisplayName("la division 2 / 2 debe ser igual a 1")
    @Test
    public void testDivision() {

        Calculadora c = new Calculadora();

        double resultado = c.dividir(2, 2);

        assertEquals(1, resultado);
    }

    @DisplayName("la division 2 / 0 debe lanzar una exexcepcion")
    @Test
    public void testDivisionEntreCero() {

        Calculadora c = new Calculadora();

        assertThrows(IllegalArgumentException.class, () -> c.dividir(2, 0));
    }

    @DisplayName("El resultado de multiplicar 80 por 3 da 240")
    @Test
    public void test1() {
        Calculadora c = new Calculadora();

        double resultado = c.multiplicar(80, 3);

        assertEquals(240, resultado);

    }

    @DisplayName("El resultado de sumar 150 y 180, dividido por 3, da 110")
    @Test
    public void test2() {
        Calculadora c = new Calculadora();

        double resultado = c.sumar(150, 180) / 3;

        assertEquals(110, resultado);

    }

    @DisplayName("El resultado de restar 90 y 50, multiplicado por 15, no da 605")
    @Test
    public void test3() {
        Calculadora c = new Calculadora();

        double resultado = c.restar(90, 50) * 15;

        assertNotEquals(605, resultado);

    }

    @DisplayName("El resultado de sumar 70 y 40, multiplicado por 25, no da 2700")
    @Test
    public void test4() {
        Calculadora c = new Calculadora();

        double resultado = c.sumar(70, 40) * 25;

        assertNotEquals(2700, resultado);

    }
}