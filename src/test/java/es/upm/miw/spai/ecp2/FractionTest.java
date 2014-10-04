package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction f;
    private Fraction f2;
    private Fraction f3;

    @Before
    public void before() {
        f = new Fraction(2, 3);
        f2 = new Fraction(4, 6);
        f3 = new Fraction(5, 2);
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
