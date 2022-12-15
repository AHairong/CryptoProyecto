package tests;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import data.Crypto;
import data.Registro;

public class testRegistro {
	
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
		registro = new Registro(rank, nombreCrypto, cod, cap, precio, circulacion, vol, percentH, percentD, percentS, fecha);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRegistro() {
		assertNotNull(registro);
		assertEquals(rank, registro.getRank());
		assertEquals(nombreCrypto, registro.getNombreCrypto());
		assertEquals(cod, registro.getCodCrypto());
		assertEquals(cap, registro.getCap(), 0.00d);
		assertEquals(precio, registro.getPrecio(), 0.00d);
		assertEquals(circulacion, registro.getCirculacion(), 0.00d );
		assertEquals(vol, registro.getVol(), 0.00d);
		assertEquals(percentH, registro.getPercentH(), 0.00d);
		assertEquals(percentD, registro.getPercentD(), 0.00d);
		assertEquals(percentS, registro.getPercentS(), 0.00d);
		assertEquals(fecha, registro.getFecha());
		
	}

	@Test
	public void testGetRank() {
		assertEquals(rank, registro.getRank());
	}

	@Test
	public void testSetRank() {
		registro.setRank(5);
		assertEquals(5, registro.getRank(),0);
		
	}

	@Test
	public void testGetNombreCrypto() {
		assertEquals(nombreCrypto, registro.getNombreCrypto());
	}

	@Test
	public void testSetNombreCrypto() {
		
		registro.setNombreCrypto("Polygon");
		assertEquals("Polygon", registro.getNombreCrypto());
	}

	@Test
	public void testGetCodCrypto() {
		assertEquals(cod, registro.getCodCrypto());
		
	}

	@Test
	public void testSetCodCrypto() {
		registro.setCodCrypto("MATIC");
		assertEquals("MATIC", registro.getCodCrypto());
	}

	@Test
	public void testGetCap() {
		assertEquals(cap, registro.getCap(), 0.00d);
	}

	@Test
	public void testSetCap() {
		registro.setCap(2.1);
		assertEquals(2.1, registro.getCap(), 0.00d);
	}

	@Test
	public void testGetPrecio() {
		assertEquals(precio, registro.getPrecio(), 0.00d);
	}

	@Test
	public void testSetPrecio() {
		registro.setPrecio(2.2);
		assertEquals(2.2, registro.getPrecio(), 0.00d);
	}

	@Test
	public void testGetCirculacion() {
		assertEquals(circulacion, registro.getCirculacion(), 0.00d );
	}

	@Test
	public void testSetCirculacion() {
		registro.setCirculacion(2.3);
		assertEquals(2.3, registro.getCirculacion(), 0.00d);
	}

	@Test
	public void testGetVol() {
		assertEquals(vol, registro.getVol(), 0.00d);
	
	}

	@Test
	public void testSetVol() {
		registro.setVol(2.4);
		assertEquals(2.4, registro.getVol(), 0.00000d);
	}

	@Test
	public void testGetPercentH() {
		assertEquals(percentH, registro.getPercentH(), 0.0000d);
	}

	@Test
	public void testSetPercentH() {
		registro.setPercentH(2.5);
		assertEquals(2.5, registro.getPercentH(), 0.00d);
	}

	@Test
	public void testGetPercentD() {
		assertEquals(percentD, registro.getPercentD(), 0.00d);
	}

	@Test
	public void testSetPercentD() {
		registro.setPercentD(2.6);
		assertEquals(2.6, registro.getPercentD(), 0.00d);
	}

	@Test
	public void testGetPercentS() {
		assertEquals(percentS, registro.getPercentS(), 0.00d);
	}

	@Test
	public void testSetPercentS() {
		registro.setPercentS(2.7);
		assertEquals(2.7, registro.getPercentS(), 0.00d);
	}

	@Test
	public void testGetFecha() {
		assertEquals(fecha, registro.getFecha());
	}

	@Test
	public void testSetFecha() {
		try {
			new Registro(1, "Cardano", "ADA", 1,0,2,3,4,7,8, null);
			fail( "NullPointer no generado" );
		} catch (NullPointerException e) {
		}
		LocalDate fecha = LocalDate.of(2021, 5, 12);
		registro.setFecha(fecha);
		assertEquals(fecha, registro.getFecha() );
		
	}

	@Test
	public void testToString() {
		String toString = String.format("%s: %.00f", nombreCrypto, precio);
		
		assertEquals(toString, registro.toString());
	}

}
