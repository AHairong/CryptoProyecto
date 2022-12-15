package baseDatos;

import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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


import data.Registro;

public class GestorBD {
	
	private final String PROPERTIES_FILE = "properties/app.properties";
	private final String XLSX_Registros = "files/Registros.xlsx";
	
	
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
	                + " nombre  FOREIGN KEY(nombre) REFERENCES Comic(tipo) ON DELETE CASCADE\n"
	                + " codCrypto FOREIGN KEY() REFERENCES Comic(cod) ON DELETE CASCADE\n"
	                + " cap Double ,\n"
	                + " precio Double ,\n"
	                + " circulacion Double ,\n"
	                + " vol Double ,\n"
	                + " PercentH Double ,\n"
	                + " PercentD Double ,\n"
	                + " PercentS Double ,\n"
	                + " fecha Date ,\\n"
	                + ");";
	
			String sql3 = "CREATE TABLE IF NOT EXISTS Admin(\n"
	                + " id_Admin INTEGER PRIMARY KEY AUTOINCREMENT,\n"
	                + " nombre STRING,\n"
	                + " email STRING\n"
	                + " passw STRING\n"
	                + ");";
			
	        //Se abre la conexión y se crea un PreparedStatement para cada tabla
			//Al abrir la conexión, si no existía el fichero, se crea la base de datos
			try (Connection con = DriverManager.getConnection(connectionString);
			     PreparedStatement pStmt1 = con.prepareStatement(sql1);
				 PreparedStatement pStmt2 = con.prepareStatement(sql2);
				 PreparedStatement pStmt3 = con.prepareStatement(sql3)) {
				
				//Se ejecutan las sentencias de creación de las tablas
		        if (!pStmt1.execute() && !pStmt2.execute() && !pStmt3.execute()) {
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
	
	private List<Registro> loadXLSX() {
		
		    
		    FileInputStream file = new FileInputStream("files/Registros.xlsx");
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		    XSSFSheet sheet = workbook.getSheetAt(0);
		    sheet.shiftRows(0,0,1); // Para saltarse la primera fila del excel
		    Iterator<Row> rowIterator = sheet.iterator();
		    // Iterate through each row in the sheet
		    for (Row row : sheet) {
		      // Create an object to represent the data in the row
		      Registro reg = new Registro();
		      // Set the object's properties using the cells in the row
		      reg.setRank(row.getCell(0));
		      reg.setNombreCrypto(row.getCell(1));
		      reg.setCodCrypto(row.getCell(2));
		      reg.setCap(row.getCell(3));
		      reg.setPrecio(row.getCell(4));
		      reg.setCirculacion(row.getCell(5));
		      reg.setVol(row.getCell(6));
		      reg.setPercentH(row.getCell(7));
		      reg.setPercentD(row.getCell(8));
		      reg.setPercentS(row.getCell(9));
		      reg.setFecha(row.getCell(10));

		      // Add the object to a list or collection
		      List<Registro> registros = new ArrayList<>();
		      registros.add(reg);
		    }

		    // Close the file
		    file.close();
	}	

}
