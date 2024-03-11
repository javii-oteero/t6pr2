package es.iesmz.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiasLluviaTest {

    @Test
    public void testRegistroDia() {
        DiasLluvia diasLluvia = new DiasLluvia();
        assertTrue(diasLluvia.registroDia(10, 0, true));
        assertTrue(diasLluvia.registroDia(15, 1, false));
        assertFalse(diasLluvia.registroDia(32, 2, true));
    }

    @Test
    public void testRegistroDiaNotEquals() {
        DiasLluvia diasLluvia = new DiasLluvia();
        assertFalse(diasLluvia.registroDia(5, 3, true));
        assertFalse(diasLluvia.registroDia(20, 8, false));
    }

    @Test
    public void testConsultarDia() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(5, 0, true);
        assertTrue(diasLluvia.consultarDia(5, 0));
        assertFalse(diasLluvia.consultarDia(10, 0));
    }

    @Test
    public void testContarDiasLLuviosos() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(3, 2, true);
        diasLluvia.registroDia(8, 5, true);
        assertEquals(2, diasLluvia.contarDiasLLuviosos());
    }

    @Test
    public void testContarDiasLLuviososNotEquals() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(2, 1, true);
        diasLluvia.registroDia(12, 4, true);
        assertFalse(1 == diasLluvia.contarDiasLLuviosos());
    }

    @Test
    public void testPrimerDiaLluvia() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(8, 0, true);
        diasLluvia.registroDia(10, 1, true);
        assertEquals(9, diasLluvia.primerDiaLluvia());
    }

    @Test
    public void testPrimerDiaLluviaNotEquals() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(3, 4, true);
        diasLluvia.registroDia(25, 7, true);
        assertFalse(20 == diasLluvia.primerDiaLluvia());
    }


}
