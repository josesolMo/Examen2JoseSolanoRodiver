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
        assertEquals(10, Calculadora.convertirNumero(1010, a));
    }

    @Test
    public void testConvertirOctalADecimal() {
        assertEquals(8, Calculadora.convertirNumero("10", 1));
    }

    @Test
    public void testConvertirHexaADecimal() {
        assertEquals(255, Calculadora.convertirNumero("FF", 3));
    }

    @Test
    public void testConvertirInvalido() {
        assertEquals(-1, Calculadora.convertirNumero("GHI", 3));
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
    public void testDecimalABinario() {
        assertEquals("1010", Calculadora.convertirADestino(10, 0));
    }

    @Test
    public void testDecimalAOctal() {
        assertEquals("12", Calculadora.convertirADestino(10, 1));
    }

    @Test
    public void testDecimalADecimal() {
        assertEquals("100", Calculadora.convertirADestino(100, 2));
    }

    @Test
    public void testDecimalAHexa() {
        assertEquals("ff", Calculadora.convertirADestino(255, 3).toLowerCase());
    }

    // --- Pruebas para el método Encuentra ---
    @Test
    public void testEncuentraElementoPresente() {
        int[] lista = {1, 2, 3, 4, 5};
        assertTrue(Calculadora.Encuentra(lista, 3));
    }

    @Test
    public void testEncuentraElementoAusente() {
        int[] lista = {1, 2, 3, 4, 5};
        assertFalse(Calculadora.Encuentra(lista, 10));
    }

    @Test
    public void testEncuentraListaVacia() {
        int[] lista = {};
        assertFalse(Calculadora.Encuentra(lista, 5));
    }

    @Test
    public void testEncuentraPrimerElemento() {
        int[] lista = {7, 8, 9};
        assertTrue(Calculadora.Encuentra(lista, 7));
    }

    @Test
    public void testEncuentraUltimoElemento() {
        int[] lista = {10, 20, 30};
        assertTrue(Calculadora.Encuentra(lista, 30));
    }
}
