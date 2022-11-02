package data;

public class Administrador extends Persona{
	
	private String tlf;
	private Integer clave;

	public Administrador(String name, String apellidos, String email, Integer clave, String tlf) {
		super(name, apellidos, email);
		// TODO Auto-generated constructor stub
		this.tlf = tlf;
		this.clave = clave;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public Integer getClave() {
		return clave;
	}

	public void setClave(Integer clave) {
		this.clave = clave;
	}
	
	

}
