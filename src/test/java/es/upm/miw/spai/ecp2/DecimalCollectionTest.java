package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

	private DecimalCollection decColl;

	@Before
	public void before() {
        decColl = new DecimalCollection();
        decColl.add(1.1);
        decColl.add(1.2);
    }

	@Test
	public final void testSize() {
		assertEquals(2, decColl.size());
	}

	@Test
	public final void testSum() {
		assertEquals(2.3, decColl.sum(), 10e-5);
	}

	@Test
	public final void testHigher() {
		assertEquals(1.2, decColl.higher(), 10e-5);
	}
}
