package data;

public class Usuario extends Persona{
	
	private String email;

	public Usuario(String name, String apellidos, String user, String contraseña, String email) {
		super(name, apellidos, user, contraseña);
		// TODO Auto-generated constructor stub
		this.email = email;
	}
	
	
	

}
