package data;

public class Crypto {
	private Integer ID;
	private String name;
	private String symbol;
	private String slug;
	private String date;
	private Float supp;
	
	
	public Crypto(Integer iD,String name, String symbol, String slug, String date, Float supp) {
		
		this.name = name;
		this.supp = supp;
		this.symbol = symbol;
		this.slug = slug;
		this.ID = iD;
		this.date =  date; // Tengo que mejorar el código para que solo permita un formato de string
	}


	public Integer getID() {
		return ID;
	}


	public void setID(Integer iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSymbol() {
		return symbol;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	public String getSlug() {
		return slug;
	}


	public void setSlug(String slug) {
		this.slug = slug;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Float getSupp() {
		return supp;
	}


	public void setSupp(Float supp) {
		this.supp = supp;
	}
	
	


	
	

}
