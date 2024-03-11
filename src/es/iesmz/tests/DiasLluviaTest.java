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
        assertFalse(diasLluvia.registroDia(32, 1, true));
        assertFalse(diasLluvia.consultarDia(12, 32));
    }

    @Test
    public void testConsultarDia() {
        DiasLluvia diasLluvia = new DiasLluvia();

        diasLluvia.registroDia(5, 0, true);
        diasLluvia.registroDia(10, 1, false);
        diasLluvia.registroDia(15, 2, true);

        assertTrue(diasLluvia.consultarDia(0, 5));
        assertFalse(diasLluvia.consultarDia(1, 10));
        assertTrue(diasLluvia.consultarDia(2, 15));

        assertFalse(diasLluvia.consultarDia(3, 20));
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

    @Test
    public void testTrimestreLluvioso() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(2, 0, true);
        diasLluvia.registroDia(10, 1, true);
        diasLluvia.registroDia(15, 3, true);
        diasLluvia.registroDia(28, 6, true);
        assertEquals(1, diasLluvia.trimestreLluvioso());
    }

    @Test
    public void testTrimestreLluviosoNotEquals() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(7, 11, true);
        diasLluvia.registroDia(20, 2, true);
        assertFalse(4 == diasLluvia.trimestreLluvioso());
    }


}
