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
    
    @Test
    public void testIsPropia(){
    	assertEquals(true, f.isPropia());
    }
    
    @Test
    public void testIsImpropia(){
    	assertEquals(false, f.isImpropia());
    }
    
    @Test
    public void testIsEquivalente(){
    	Fraction faux = new Fraction(4,6);
    	assertEquals(true, f.isEquivalente(faux));
    }
    
    
    @Test
    public void testIsPropiaFalse(){
    	assertEquals(false, !f.isPropia());
    }
    
    @Test
    public void testIsImpropiaFalse(){
    	assertEquals(true, !f.isImpropia());
    }
    
    @Test
    public void testIsEquivalenteFalse(){
    	Fraction faux = new Fraction(4,7);
    	assertEquals(false, f.isEquivalente(faux));
    }
}
