package data;

import java.util.regex.Pattern;

public class Crypto {
	private String tipo;
	private String cod;
	
	public Crypto (String tipo, String cod) {
		
		if(tipo == null){
			throw new NullPointerException("El tipo de criptomoneda nulo");
		}
		// Expresión regular que no permite la insercción de ningun codigó con letras minusculas o que este compuesto de mas de una palabra
		
		Pattern pattern = Pattern.compile("^[A-Z]+$");
		if(cod != null && pattern.matcher(cod).matches()){
			this.cod = cod;
		}	    

		this.tipo = tipo;
		
	}

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
		this.cod = cod;
	}
	
}
