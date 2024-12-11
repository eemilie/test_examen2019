package org.example;

import java.util.List;
import org.junit.jupiter.api.Test;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;

public class ClaseExamenTest {

    @Test
    void testPrimosCaso6() {
        // Caso n = 6
        List<Integer> expected = List.of(2,3);
        assertEquals(expected, ClaseExamen.primos(6));
    }
    @Test
    void testPrimosCaso13() {
        // Caso n = 13 (primo)
        List<Integer> expected = List.of(13);
        assertEquals(expected, ClaseExamen.primos(13));
    }

    @Test
    void testPrimosCaso25() {
        // Caso n = 25 (potencia de primo)
        List<Integer> expected = List.of(5, 5);
        assertEquals(expected, ClaseExamen.primos(25));
    }

    @Test
    void testPrimosEntradaInvalida() {
        // Caso de entrada inválida n = 1
        Exception exception = assertThrows(IllegalArgumentException.class, () -> ClaseExamen.primos(1));
        assertEquals("Entrada inválida: n debe ser mayor que 1.", exception.getMessage());
    }

}
