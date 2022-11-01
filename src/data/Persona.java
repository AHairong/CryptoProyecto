package data;

public class Persona {
	
	private String name;
	private String apellidos;
	private String user;
	private String contraseña;
	
	public Persona(String name, String apellidos, String user, String contraseña) {
		super();
		this.name = name;
		this.apellidos = apellidos;
		this.user = user;
		this.contraseña = contraseña;
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	

}
