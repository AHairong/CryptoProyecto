package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.Crypto;

public class testCrypto {
	
	private Crypto crypto;
	private Integer ID = 1;
	private String name = "Bitcoin";
	private String symbol = "BTC";
	private String slug = "bitcoin";
	private String date = "2022-11-01T19:19:00Z";
	private Float supp = 69991334.8025f;
	

	@Before
	public void setUp() throws Exception {
		
		crypto = new Crypto(ID, name, symbol, slug, date, supp);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCrypto() {
		
		assertNotNull(crypto);
		assertEquals(ID, crypto.getID());
		assertEquals(name, crypto.getName());
		assertEquals(symbol, crypto.getSymbol());
		assertEquals(slug, crypto.getSlug());
		assertEquals(date, crypto.getDate());
		assertEquals(supp, crypto.getSupp(), 0.00f);
	}

	@Test
	public void testGetID() {
		assertEquals(ID, crypto.getID());
	}

	@Test
	public void testSetID() {
		Integer id = 5;
		assertEquals(ID, crypto.getID());
		crypto.setID(id);
		assertEquals(id, crypto.getID());
		
		
	}

	@Test
	public void testGetName() {
		assertEquals(name, crypto.getName());
	}

	@Test
	public void testSetName() {
		crypto.setName("Pancake");
		assertEquals("Pancake", crypto.getName());
	}

	@Test
	public void testGetSymbol() {
		assertEquals(symbol, crypto.getSymbol());
	}

	@Test
	public void testSetSymbol() {
		crypto.setSymbol("CAKE");
		assertEquals("CAKE", crypto.getSymbol());
	}

	@Test
	public void testGetSlug() {
		assertEquals(slug, crypto.getSlug());
	}

	@Test
	public void testSetSlug() {
		crypto.setSlug("pancake");
		assertEquals("pancake", crypto.getSlug());
	}

	@Test
	public void testGetDate() {
		assertEquals(date, crypto.getDate());
	}

	@Test
	public void testSetDate() {
		crypto.setDate("2022-11-01T19:19:00Z");
		assertEquals("2022-11-01T19:19:00Z", crypto.getDate());
	}

	@Test
	public void testGetSupp() {
		assertEquals(supp, crypto.getSupp(), 0.00f);
		
	}

	@Test
	public void testSetSupp() {
		crypto.setSupp(8765.0988f);
		assertEquals(8765.0988f, crypto.getSupp(), 0.0f);
	}

}
