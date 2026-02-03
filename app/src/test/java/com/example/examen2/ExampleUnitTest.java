package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Calculadora.
 */
public class ExampleUnitTest {

    // --- Pruebas para convertirNumero (entrada a decimal) ---
    @Test
    public void testConvertirInvalido() {
        assertEquals(-1, Calculadora.convertirNumero("GHI", 3));
    }

    @Test
    public void testConvertirOctalADecimal() {
        assertEquals(8, Calculadora.convertirNumero("10", 1));
    }

    // --- Pruebas para realizarOperacion ---
    @Test
    public void testMultiplicacion() {
        assertEquals(50, Calculadora.realizarOperacion(10, 5, "*"));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {
        Calculadora.realizarOperacion(10, 0, "/");
    }

    // --- Pruebas para convertirADestino (decimal a salida) ---
    @Test
    public void testDecimalAOctal() {
        assertEquals("12", Calculadora.convertirADestino(10, 1));
    }

    @Test
    public void testDecimalADecimal() {
        assertEquals("100", Calculadora.convertirADestino(100, 2));
    }
}