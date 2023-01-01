package baseDatos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import data.Crypto;
import data.Registro;

public class GestorBD {
	
	private final String PROPERTIES_FILE = "properties/app.properties";
	private final String CSV_REGISTROS = "files/Registros.csv";
	
	
	private Properties properties;
	private String driverName;
	private String databaseFile;
	private String connectionString;
	
	private static Logger logger = Logger.getLogger(GestorBD.class.getName());
	
	public GestorBD() {
		
		try (FileInputStream fis = new FileInputStream("conf/logger.properties")) {
			//Inicialización del Logger
			LogManager.getLogManager().readConfiguration(fis);
			
			//Lectura del fichero properties
			properties = new Properties();
			properties.load(new FileReader(PROPERTIES_FILE));
			
			driverName = properties.getProperty("driver");
			databaseFile = properties.getProperty("file");
			connectionString = properties.getProperty("connection");
			
			//Cargar el diver SQLite
			Class.forName(driverName);
		} catch (Exception ex) {
			logger.warning(String.format("Error al cargar el driver de BBDD: %s", ex.getMessage()));
		}
	}
	
	/**
	 * Inicializa la BBDD leyendo los datos de los ficheros CSV 
	 */
	/*public void initilizeFromCSV() {
		//Sólo se inicializa la BBDD si la propiedad initBBDD es true.
		if (properties.get("loadCSV").equals("true")) {
			//Se borran los datos, si existía alguno
			this.borrarDatos();
			
			//Se leen los registros del CSV
			List<Registro> registros = this.loadCSVRegistros();
			//Se insertan los personajes en la BBDD
			this.insertarRegistros(registros.toArray(new Registro[registros.size()]));
			//Isnsertarregistros lee registros y añade id de admin
			
			
			//Se insertan los comics en la BBDD
			this.insertarComic(comics.toArray(new C[comics.size()]));				
		}
	}*/
	
	public void crearBBDD() {
		
		
		//Sólo se crea la BBDD si la propiedad initBBDD es true.
		if (properties.get("createBBDD").equals("true")) {
			String sql1 = "CREATE TABLE IF NOT EXISTS Crypto (\n"
	                + " tipo STRING,\n"
	                + "cod  STRING PRIMARY KEY\n"
	                +");";
	
			String sql2 = "CREATE TABLE IF NOT EXISTS Registro (\n"
	                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
	                + " rank INTEGER NOT NULL,\n"
	                + " codCrypto FOREIGN KEY() REFERENCES Crypto(cod) ON DELETE CASCADE,\n"
	                + " cap Double ,\n"
	                + " precio Double ,\n"
	                + " circulacion Double ,\n"
	                + " vol Double ,\n"
	                + " PercentH Double ,\n"
	                + " PercentD Double ,\n"
	                + " PercentS Double ,\n"
	                + " fecha Date ,\n"
	                + ");";
	
			String sql3 = "CREATE TABLE IF NOT EXISTS Admin(\n"
	                + " id INTEGER PRIMARY KEY,\n"
	                + " nombre STRING,\n"
	                + " email STRING\n"
	                + " passw STRING\n"
	                + ");";
			
			String sql4 = "INSERT INTO Admin(1, 'Milo', 'milo@gmail.com', 'adminMilo'  )";
			
			//Crear query de insertar un admin 
			
	        //Se abre la conexión y se crea un PreparedStatement para cada tabla
			//Al abrir la conexión, si no existía el fichero, se crea la base de datos
			try (Connection con = DriverManager.getConnection(connectionString);
			     PreparedStatement pStmt1 = con.prepareStatement(sql1);
				 PreparedStatement pStmt2 = con.prepareStatement(sql2);
				 PreparedStatement pStmt3 = con.prepareStatement(sql3);
				 PreparedStatement pStmt4 = con.prepareStatement(sql4)) {
				
				//Se ejecutan las sentencias de creación de las tablas
		        if (!pStmt1.execute() && !pStmt2.execute() && !pStmt3.execute() && !pStmt4.execute()) {
		        	logger.info("Se han creado las tablas");
		        }
			} catch (Exception ex) {
				logger.warning(String.format("Error al crear las tablas: %s", ex.getMessage()));
			}
		}
	}	
	
	public void borrarBBDD() {
		//Sólo se borra la BBDD si la propiedad deleteBBDD es true
		if (properties.get("deleteBBDD").equals("true")) {	
			String sql1 = "DROP TABLE IF EXISTS Registro;";
			String sql2 = "DROP TABLE IF EXISTS Crypto";
			String sql3 = "DROP TABLE IF EXISTS Admin;";
			
	        //Se abre la conexión y se crea un PreparedStatement para cada tabla
			//Al abrir la conexión, si no existía el fichero, se crea la base de datos
			try (Connection con = DriverManager.getConnection(connectionString);
			     PreparedStatement pStmt1 = con.prepareStatement(sql1);
				 PreparedStatement pStmt2 = con.prepareStatement(sql2);
				 PreparedStatement pStmt3 = con.prepareStatement(sql3)) {
				
				//Se ejecutan las sentencias de borrado de las tablas
		        if (!pStmt1.execute() && !pStmt2.execute() && !pStmt3.execute()) {
		        	logger.info("Se han borrado las tablas");
		        }
			} catch (Exception ex) {
				logger.warning(String.format("Error al borrar las tablas: %s", ex.getMessage()));
			}
			
			try {
				//Se borra el fichero de la BBDD
				Files.delete(Paths.get(databaseFile));
				logger.info("Se ha borrado el fichero de la BBDD");
			} catch (Exception ex) {
				logger.warning(String.format("Error al borrar el fichero de la BBDD: %s", ex.getMessage()));
			}
		}
	}
	
	public void borrarDatos() {
		//Sólo se borran los datos si la propiedad cleanBBDD es true
		if (properties.get("cleanBBDD").equals("true")) {	
			String sql1 = "DELETE FROM Registro";
			String sql2 = "DELETE FROM Crypto;";
			String sql3 = "DELETE FROM Admin;";
			
	        //Se abre la conexión y se crea un PreparedStatement para cada tabla
			//Al abrir la conexión, si no existía el fichero, se crea la base de datos
			try (Connection con = DriverManager.getConnection(connectionString);
			     PreparedStatement pStmt1 = con.prepareStatement(sql1);
				 PreparedStatement pStmt2 = con.prepareStatement(sql2);
				 PreparedStatement pStmt3 = con.prepareStatement(sql3)) {
				
				//Se ejecutan las sentencias de borrado de las tablas
		        if (!pStmt1.execute() && !pStmt2.execute() && !pStmt3.execute()) {
		        	logger.info("Se han borrado los datos");
		        }
			} catch (Exception ex) {
				logger.warning(String.format("Error al borrar los datos: %s", ex.getMessage()));
			}
		}
	}
	
	private int logIn (String nombre, String passw) {
		Integer id = null;
		String sql = "SELECT id FROM Admin WHERE nombre = '"+nombre+"' and passw = '"+passw+"'";
		
		try (Connection con = DriverManager.getConnection(connectionString);
			 PreparedStatement pStmt = con.prepareStatement(sql);
				
		){
			ResultSet rs = pStmt.executeQuery();
			
			if (rs.next()) {
				id = rs.getInt("id");
				logger.info(String.format("Un admin coincide con estos datos"));
			}
			else {
				logger.info(String.format("No existe un admin coincidente"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return id;
	}
	
	
	
	private List<Registro> loadCSVRegistros(){
		
		List<Registro> registros= new ArrayList<>();
		
		try (BufferedReader in = new BufferedReader(new FileReader(CSV_REGISTROS))) {
			String linea = null;
			
			//Omitir la cabecera
			in.readLine();			
			
			while ((linea = in.readLine()) != null) {
				registros.add(Registro.parseCSV(linea));
			}			
			
		} catch (Exception ex) {
			logger.warning(String.format("Error leyendo personajes del CSV: %s", ex.getMessage()));
		}
		
		return registros;
	}
	
	private List<Crypto> loadCVSComics() {
		List<Crypto> cryptos = new ArrayList<>();
		
		try (BufferedReader in = new BufferedReader(new FileReader(CSV_REGISTROS))) {
			String linea = null;
			
			//Omitir la cabecera
			in.readLine();			
			
			while ((linea = in.readLine()) != null) {
				if(!cryptos.contains(Crypto.parseCSV(linea))) {
					cryptos.add(Crypto.parseCSV(linea));
				}
			}			
			
		} catch (Exception ex) {
			logger.warning(String.format("Error leyendo comics del CSV: %s", ex.getMessage()));
		}
		
		return cryptos;
	}
	
}
