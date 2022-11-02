package data;

public class Persona {
	
	private String name;
	private String apellidos;
	private String email;
	
	
	public Persona(String name, String apellidos, String email) {
		
		this.name = name;
		this.apellidos = apellidos;
		this.email = email;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	

}
