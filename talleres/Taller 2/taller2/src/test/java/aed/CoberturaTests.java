package aed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CoberturaTests {
    Cobertura cobertura = new Cobertura();

    @Test
    void testFizzBuzz() {
        assertEquals(cobertura.fizzBuzz(15), "FizzBuzz");
        assertEquals(cobertura.fizzBuzz(6), "Fizz");
        assertEquals(cobertura.fizzBuzz(20), "Buzz");
        assertEquals(cobertura.fizzBuzz(2), "2");
    }

    @Test
    void testNumeroCombinatorio() {
        assertTrue(cobertura.numeroCombinatorio(1, 0) == 1);
        assertTrue(cobertura.numeroCombinatorio(2, 2) == 1);
        assertTrue(cobertura.numeroCombinatorio(2, 3) == 0);
        assertEquals(cobertura.numeroCombinatorio(4, 3), 4);
    }

    @Test
    void testRepeticionesConsecutivas() {
        assertTrue(cobertura.repeticionesConsecutivas(new int[0]) == 0);
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{}) == 0);
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{1, 2, 3, 4}) == 1);
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{1, 1, 3, 1}) == 2);
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{1, 1, 1, 1}) == 4);
    }
}
