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


}
