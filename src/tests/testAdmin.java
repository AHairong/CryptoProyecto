package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.Admin;

public class testAdmin {
	
	private Admin admin;
	private String nom = "Neo";
	private String passw = " 1234 ";
	private String email = "neo@gmail.com";
	private Integer id = 1;
	
	

	@Before
	public void setUp() throws Exception {
		
		admin = new Admin(id, nom, email, passw);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdmin() {
		assertNotNull(admin);
		assertEquals(id, admin.getId());
		assertEquals(nom, admin.getNom());
		assertEquals(passw, admin.getPassw());
		assertEquals(email, admin.getEmail());
		
	}

	@Test
	public void testGetId() {
		assertEquals(id, admin.getId());

		
	}

	@Test
	public void testSetId() {
		admin.setId(8);
		assertEquals(8, admin.getId(),0);
	}

	@Test
	public void testGetNom() {
		assertEquals(nom, admin.getNom());
		
	}

	@Test
	public void testSetNom() {
		admin.setNom("Jade");
		assertEquals("Jade", admin.getNom());
	}

	@Test
	public void testGetEmail() {
		assertEquals(email, admin.getEmail());
	}

	@Test
	public void testSetEmail() {
		try {
			new Admin(null, "Wang","prueba@prueba.com", "passw");
			fail( "NullPointer no generado" );
			new Admin(1, null,"prueba@prueba.com", "passw");
			fail( "NullPointer no generado" );
			new Admin(1, "Wang","prueba@prueba.com", null);
			fail( "NullPointer no generado" );
			
		} catch (NullPointerException e) {
		}
		Admin a = new Admin(1,"Wang","emailIncorrecto", "passw");
		assertNull( a.getEmail() );
		a = new Admin(1,"Wang", "emailIncorrecto@", "passw");
		assertNull( a.getEmail() );
		a = new Admin(1, "Wang","@gmail.com", "passw");
		assertNull( a.getEmail() );
	}

	@Test
	public void testGetPassw() {
		assertEquals(passw, admin.getPassw());
	}

	@Test
	public void testSetPassw() {
		admin.setPassw("wssap");
		assertEquals("wssap", admin.getPassw());
	}

}
