package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.Crypto;

public class testCrypto {
	
	private Crypto crypto;
	private String tipo = "Bitcoin";
	private String cod ="BTC";

	@Before
	public void setUp() throws Exception {
		crypto = new Crypto(tipo, cod);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testCrypto() {
		assertNotNull(crypto);
		assertEquals(tipo, crypto.getTipo());
		assertEquals(cod, crypto.getCod());
	}

	@Test
	public void testGetTipo() {
		assertEquals(tipo, crypto.getTipo());
	}

	@Test
	public void testSetTipo() {
		crypto.setTipo("Cardano");
		assertEquals("Cardano", crypto.getTipo());
	}

	@Test
	public void testGetCod() {
		assertEquals("BTC", crypto.getCod());
	
	}	
		

	@Test
	public void testSetCod() {
		//Se confirma que no se puede 
		try {
			new Crypto(null, "ADA");
			fail( "NullPointer no generado" );
		} catch (NullPointerException e) {
		}
		Crypto c = new Crypto("Cardano", "123s");
		assertNull( c.getCod() );
		c = new Crypto("Cardano", "asa");
		assertNull( c.getCod() );
		
			
	}

}
