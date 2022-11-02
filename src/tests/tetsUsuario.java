package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.Usuario;

public class tetsUsuario {
	
	private Usuario user;
	private String name = "Martin";
	private String apellidos = "Rivas";
	private String email = "email@gmail.com";
	private String contra = "pruebaContra";
	private String username = "MR";
	private Integer numVisitas = 1;

	@Before
	public void setUp() throws Exception {
		user = new Usuario (name, apellidos, username, email, contra, numVisitas);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUsuario() {
		
		assertNotNull(user);
		assertEquals(name, user.getName());
		assertEquals(apellidos, user.getApellidos());
		assertEquals(email, user.getEmail());
		assertEquals(numVisitas, user.getNumVisitas());
		assertEquals(username, user.getUser());
		assertEquals(contra, user.getPassword());

		
	}

	@Test
	public void testGetUser() {
		
		assertEquals(username, user.getUser());
	}

	@Test
	public void testSetUser() {
		
		user.setUser("WR");
		assertEquals("WR", user.getUser());
		
	}

	@Test
	public void testGetNumVisitas() {
		
		assertEquals(numVisitas, user.getNumVisitas());
		
	}

	@Test
	public void testSetNumVisitas() {
		
		Integer num = 5;
		user.setNumVisitas(num);
		assertEquals(num, user.getNumVisitas());
		
	}

	@Test
	public void testGetPassword() {
		
		assertEquals(contra, user.getPassword());
		
	}

	@Test
	public void testSetPassword() {
		
		user.setPassword("contraContra");
		assertEquals("contraContra", user.getPassword());
		
	}

}
