package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.Crypto;

public class gestorBD {
	
	protected static final String DRIVER_NAME = "org.sqlite.JDBC";
	protected static final String DATABASE_FILE = "db/database.db";
	protected static final String CONNECTION_STRING = "jdbc:sqlite:" + DATABASE_FILE;
	
	
	public List<Crypto> obtenerDatos() {
		List<Crypto> cryptos = new ArrayList<>();
		
		//Se abre la conexión y se obtiene el Statement
		try (Connection con = DriverManager.getConnection(CONNECTION_STRING);
		     Statement stmt = con.createStatement()) {
			String sql = "SELECT * FROM CLIENTE WHERE ID >= 0";
			
			//Se ejecuta la sentencia y se obtiene el ResultSet con los resutlados
			ResultSet rs = stmt.executeQuery(sql);			
			Crypto crypto;
			
			//Se recorre el ResultSet y se crean objetos Cliente
			while (rs.next()) {
				crypto = new Crypto();
				
				crypto.setID(rs.getInt("ID"));
				crypto.setName(rs.getString("Name"));
				crypto.setSymbol(rs.getString("Symbol"));
				crypto.setSlug(rs.getString("Slug"));
				crypto.setDate(rs.getString("Date"));
				crypto.setSupp(rs.getString("Csupply"));
				
				//Se inserta cada nuevo cliente en la lista de clientes
				cryptos.add(crypto);
			}
			
			//Se cierra el ResultSet
			rs.close();
			
			System.out.println(String.format("- Se han recuperado %d clientes...", cryptos.size()));			
		} catch (Exception ex) {
			System.err.println(String.format("* Error al obtener datos de la BBDD: %s", ex.getMessage()));
			ex.printStackTrace();						
		}		
		
		return cryptos;
	}


}
