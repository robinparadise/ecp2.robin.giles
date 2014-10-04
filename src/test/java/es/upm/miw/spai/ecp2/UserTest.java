package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private int number = 2;
    private String name = "Fulanito";
    private String familyName = "Smith";
    private User user;
    
    @Before
    public void before() {
        user = new User(number, name, familyName);
    }

	@Test
	public void testGetNumber() {
		assertEquals(number, user.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals(name, user.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals(familyName, user.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Fulanito Smith", user.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("F.", user.initials());
	}

}
