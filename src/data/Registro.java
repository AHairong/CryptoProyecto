package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;


public class Registro {
	
	private int id;
	private Integer rank;
	private String nomCrypto;
	private String codCrypto;
	private double cap;
	private double precio;
	private double circulacion;
	private double vol;
	private double percentH;
	private double percentD;
	private double percentS;
	private Date fecha;
	private int id_admin;
	
	

	public String getNomCrypto() {
		return nomCrypto;
	}

	public void setNomCrypto(String nomCrypto) {
		this.nomCrypto = nomCrypto;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

		 try {
		   this.fecha = formatter.parse(fecha);
		 } catch (ParseException e) {
		   e.printStackTrace();
		 }
		
	}
	public int getId_admin() {
		return id_admin;
	}

	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}

	@Override
	public String toString() {
		
		
		return String.format("%s: %.00f", codCrypto, precio); 
		
	}
	
	//Crea un Registro a partir de una cadena de texto separada por comas.
	public static Registro parseCSV(String csvString) {
		if (csvString != null && !csvString.isBlank()) {		
			StringTokenizer tokenizer = new StringTokenizer(csvString, ",");
				
			Registro reg = new Registro();
				
			reg.setRank(Integer.valueOf(tokenizer.nextToken()));
			reg.setNomCrypto(tokenizer.nextToken());
			reg.setCodCrypto(tokenizer.nextToken());
			reg.setCap(Double.valueOf(tokenizer.nextToken()));
			reg.setPrecio(Double.valueOf(tokenizer.nextToken()));
			reg.setCirculacion(Double.valueOf(tokenizer.nextToken()));
			reg.setVol(Double.valueOf(tokenizer.nextToken()));
			reg.setPercentH(Double.valueOf(tokenizer.nextToken()));
			reg.setPercentD(Double.valueOf(tokenizer.nextToken()));
			reg.setPercentS(Double.valueOf(tokenizer.nextToken()));
			reg.setFecha(tokenizer.nextToken());
				
			return reg;
			} else {
				return null;
			}
		}
	
	
	
	

}
