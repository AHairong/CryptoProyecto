package data;

public class Usuario extends Persona{
	
	
	private String user;
	private String password;
	private Integer numVisitas;

	public Usuario(String name, String apellidos, String user, String email,String password,  Integer numVisitas) {
		super(name, apellidos, email);
		// TODO Auto-generated constructor stub
		
		this.user = user;
		this.numVisitas = numVisitas;
		this.password = password;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Integer getNumVisitas() {
		return numVisitas;
	}

	public void setNumVisitas(Integer numVisitas) {
		this.numVisitas = numVisitas;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
		
	}
	
	
	
	
	
	

}
