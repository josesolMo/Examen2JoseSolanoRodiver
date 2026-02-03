package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Calculadora.
 */
public class ExampleUnitTest {

    // --- Pruebas para convertirNumero (entrada a decimal) ---
    @Test
    public void testConvertirBinarioADecimal() {
        assertEquals(10, Calculadora.convertirNumero("1010", 0));
    }

    @Test
    public void testConvertirHexaADecimal() {
        assertEquals(255, Calculadora.convertirNumero("FF", 3));
    }

    // --- Pruebas para realizarOperacion ---
    @Test
    public void testSuma() {
        assertEquals(15, Calculadora.realizarOperacion(10, 5, "+"));
    }

    @Test
    public void testResta() {
        assertEquals(5, Calculadora.realizarOperacion(10, 5, "-"));
    }

    // --- Pruebas para convertirADestino (decimal a salida) ---
    @Test
    public void testDecimalABinario() {
        assertEquals("1010", Calculadora.convertirADestino(10, 0));
    }

    @Test
    public void testDecimalAHexa() {
        assertEquals("ff", Calculadora.convertirADestino(255, 3).toLowerCase());
    }

}