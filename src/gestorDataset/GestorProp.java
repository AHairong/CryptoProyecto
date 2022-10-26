package gestorDataset;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import com.google.gson.Gson;
import com.google.gson.JsonObject;


//Clase que va a gestionar el fichero properties
public class GestorProp {

	//Función que lee el fichero properties
	 public static String getUrl() {
	    	// Se abre el fichero de propiedades 
		 	String url = null;
	        try (FileReader reader = new FileReader("config/dataset.properties");) {
	            // Se crea el objeto y se leen las propiedades del fichero
	            Properties properties = new Properties();
	            properties.load(reader);
	            

	            // Se obtienen todas las claves y se muestran por pantalla
	            for (String key : properties.stringPropertyNames()) {
	            	url = String.format("%s", properties.get(key));
	            }
	        } catch (IOException ioe) {
	            System.err.println(String.format("No se pudo leer el fichero de propiedades %s", ioe.getMessage()));

	       }
			return url;
	 }
	 
	 public static void getJson() {
		 try
		    {
		        //creamos una URL deonde esta el JSON
		        URL url = new URL(GestorProp.getUrl());
		        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		        //Lanzamos la query al HTML
		        conn.setRequestMethod("GET");
		        conn.setRequestProperty("Accept", "application/json");
		        if (conn.getResponseCode() != 200) //200 --> Mensaje del servidor da todo ok 
		        {
		            // Exception si el mensadje del servidor es distinto a 200
		            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
		        }
		        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
		        //creamos un StringBuilder para almacenar la respuesta del web service
		        StringBuilder sb = new StringBuilder(); //StringBuilder o StringBuffer(por los hilos)?
		        int cp;
		        while ((cp = br.read()) != -1)
		        {
		          sb.append((char) cp);
		        }
		        //en la cadena output almacenamos toda la respuesta del servidor
		        String output = sb.toString();
		        //Output --> JASON (Gson) 
		        JsonObject json = new Gson().fromJson(output,JsonObject.class);
		        //Json
		        System.out.println("salida JSON" +  json);
		        //String
		        System.out.println("salida String : " +output);

		        conn.disconnect();
		    }
		    catch(Exception e)
		    {
		        System.out.println(e.getMessage());
		    }
	 }
	 public static void main(String[] args) {
		GestorProp.getJson(); 
		
	}
	 
	 
	 
	 
}
