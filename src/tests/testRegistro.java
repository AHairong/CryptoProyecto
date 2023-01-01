package tests;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.Registro;

public class testRegistro {
	private int id = 1;
	private Registro registro;
	private Integer rank = 10;
	private String nombreCrypto = "Cardano";
	private String cod = "ADA";
	private double cap = 1.1;
	private double precio = 1.2;
	private double circulacion = 1.3;
	private double vol = 1.4;
	private double percentH = 1.5;
	private double percentD= 1.6;
	private double percentS= 1.7;
	private LocalDate fecha;

	@Before
	public void setUp() throws Exception {
		fecha = LocalDate.of(2022, 12, 5);
		registro = new Registro();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetId() {
		registro.setId(1);
		assertEquals(1, registro.getId());
		
	}

	@Test
	public void testSetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testRegistro() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRank() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetRank() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNombreCrypto() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNombreCrypto() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCodCrypto() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCodCrypto() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCap() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCap() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrecio() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPrecio() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCirculacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCirculacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVol() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVol() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPercentH() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPercentH() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPercentD() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPercentD() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPercentS() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPercentS() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFecha() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFecha() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
