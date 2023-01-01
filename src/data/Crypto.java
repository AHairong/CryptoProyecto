package data;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Crypto {
	private String tipo;
	private String cod;
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		Pattern pattern = Pattern.compile("^[A-Z]+$");
		if(cod != null && pattern.matcher(cod).matches()){
			this.cod = cod;
		}	    
	}
	//Crea una Crypto a partir de una cadena de texto separada por comas.
	public static Crypto parseCSV(String csvString) {
		if (csvString != null && !csvString.isBlank()) {		
			StringTokenizer tokenizer = new StringTokenizer(csvString, ",");	
			Crypto c = new Crypto();		
			tokenizer.nextToken();
			c.setTipo(tokenizer.nextToken());
			c.setCod(tokenizer.nextToken());
			tokenizer.nextToken();
			tokenizer.nextToken();
			tokenizer.nextToken();
			tokenizer.nextToken();
			tokenizer.nextToken();
			tokenizer.nextToken();
			tokenizer.nextToken();
			tokenizer.nextToken();
			
			return c;
				
		} else {
			return null;
		}
	}
	
}
