package data;

import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class Registro {
	private Integer rank;
	private String nombreCrypto;
	private String codCrypto;
	private double cap;
	private double precio;
	private double circulacion;
	private double vol;
	private double percentH;
	private double percentD;
	private double percentS;
	private  LocalDate fecha;
	
	public Registro(Integer rank, String nombreCrypto, String codCrypto, double cap, double precio, double circulacion,
			double vol, double percentH, double percentD, double percentS, LocalDate fecha) {
		super();
		this.rank = rank;
		this.nombreCrypto = nombreCrypto;
		this.codCrypto = codCrypto;
		this.cap = cap;
		this.precio = precio;
		this.circulacion = circulacion;
		this.vol = vol;
		this.percentH = percentH;
		this.percentD = percentD;
		this.percentS = percentS;
		if(fecha == null){	//Si la fecha es nula
			throw new NullPointerException();
		}
		this.fecha = fecha;
	}
	
	public Registro()
	{
		
	}
	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getNombreCrypto() {
		return nombreCrypto;
	}

	public void setNombreCrypto(String nombreCrypto) {
		this.nombreCrypto = nombreCrypto;
	}

	public String getCodCrypto() {
		return codCrypto;
	}

	public void setCodCrypto(String codCrypto) {
		this.codCrypto = codCrypto;
	}

	public double getCap() {
		return cap;
	}

	public void setCap(double cap) {
		this.cap = cap;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCirculacion() {
		return circulacion;
	}

	public void setCirculacion(double circulacion) {
		this.circulacion = circulacion;
	}

	public double getVol() {
		return vol;
	}

	public void setVol(double vol) {
		this.vol = vol;
	}

	public double getPercentH() {
		return percentH;
	}

	public void setPercentH(double percentH) {
		this.percentH = percentH;
	}

	public double getPercentD() {
		return percentD;
	}

	public void setPercentD(double percentD) {
		this.percentD = percentD;
	}

	public double getPercentS() {
		return percentS;
	}

	public void setPercentS(double percentS) {
		this.percentS = percentS;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		
		
		return String.format("%s: %.00f", nombreCrypto, precio); 
		
	}
	
	
	
	

}
