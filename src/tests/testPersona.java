package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.Persona;

public class testPersona {
	
	private Persona per;
	private String name = "Martin";
	private String apellidos = "Rivas";
	private String email = "email@gmail.com";

	@Before
	public void setUp() throws Exception {
		per = new Persona(name, apellidos, email);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPersona() {
		
		assertNotNull(per);
		assertEquals(name, per.getName());
		assertEquals(apellidos, per.getApellidos());
		assertEquals(email, per.getEmail());
	}

	@Test
	public void testGetName() {
		assertEquals(name, per.getName());
	}

	@Test
	public void testSetName() {
		per.setName("Mario");
		assertEquals("Mario", per.getName());
	}

	@Test
	public void testGetApellidos() {
		assertEquals(apellidos, per.getApellidos());
	}

	@Test
	public void testSetApellidos() {
		per.setApellidos("Ramos");
		assertEquals("Ramos", per.getApellidos());
		
	}

	@Test
	public void testGetEmail() {
		assertEquals(email, per.getEmail());
	}

	@Test
	public void testSetEmail() {
		per.setEmail("gmai@gmail.com");
	}

}
