package data;

import java.util.regex.Pattern;

public class Admin {
	
	private Integer id;
	private String nom;
	private String email;
	private String passw;
	
	public Admin (Integer id, String nom , String email, String passw) {
		
		
		if(id == null){
			throw new NullPointerException("Id es nulo");
		}
		if(nom == null){
			throw new NullPointerException("Nom es nulo");
		}
		if(passw == null){
			throw new NullPointerException("Password es nulo");
		}
		this.id = id;
		this.nom = nom;
		this.passw = passw;
		
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		if(email != null && pattern.matcher(email).matches()){
			this.email = email;
		}	    
				
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

}
