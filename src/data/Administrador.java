package data;

public class Administrador extends Persona{
	
	private String tlf;

	public Administrador(String name, String apellidos, String user, String contraseña, String tlf) {
		super(name, apellidos, user, contraseña);
		// TODO Auto-generated constructor stub
		this.tlf = tlf;
	}
	

}
