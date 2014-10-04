package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction f;

    @Before
    public void before() {
        f = new Fraction(2, 3);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }
    
    @Test
    public void testDecimal() {
        assertEquals(0.6666, f.decimal(), 10e-5);
    }
}
