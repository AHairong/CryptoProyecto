package data;

public class Crypto {
	private String name;
	private Float supp;
	private String symbol;
	private String slug;
	private int ID;
	
	public Crypto(String name, Float supp, String symbol, String slug, int iD) {
		super();
		this.name = name;
		this.supp = supp;
		this.symbol = symbol;
		this.slug = slug;
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSupp() {
		return supp;
	}

	public void setSupp(Float supp) {
		this.supp = supp;
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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
	
	

}
