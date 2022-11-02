package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.Administrador;
import data.Usuario;

public class testAdministrador {
	
	private Administrador admin;
	private String name = "John";
	private String apellidos = "Snow";
	private String email = "firefox@gmail.com";
	private Integer clave = 1234;
	private String tlf = "616 09 54 23";

	@Before
	public void setUp() throws Exception {
		
		admin = new Administrador(name, apellidos, email, clave, tlf);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdministrador() {
		
		assertNotNull(admin);
		assertEquals(name, admin.getName());
		assertEquals(apellidos, admin.getApellidos());
		assertEquals(email, admin.getEmail());
		assertEquals(clave, admin.getClave());
		assertEquals(tlf, admin.getTlf());
	
	}

	@Test
	public void testGetTlf() {
		assertEquals(tlf, admin.getTlf());
		
	}

	@Test
	public void testSetTlf() {
		admin.setTlf("616 09 53 45");
		assertEquals("616 09 53 45", admin.getTlf());
	}

	@Test
	public void testGetClave() {
		assertEquals(clave, admin.getClave());
	}

	@Test
	public void testSetClave() {
		Integer clave = 4321;
		admin.setClave(clave);
		assertEquals(clave, admin.getClave());
	}

}
