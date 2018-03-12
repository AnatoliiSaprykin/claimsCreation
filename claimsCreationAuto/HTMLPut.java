package claimsCreationAuto;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import com.google.gson.Gson;

public class HTMLPut {
	
	static String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJNb2JpbGVEZXZ1d20iLCJyb2xlIjoiVW5kZXJ3cml0ZXIgTWFuYWdlciIsImNsaWVudElkIjoiRkZGRkZGRkZGRUY5MjIzN0RFRjk0RkZFQUZFMTdFRkJFNzFEOEVGRSIsImNsaWVudFNlY3JldCI6Ijg5OEJENUFGLUFBMEItNzc3Qi04M0E3LTFERUQzMUU2N0FGOSIsIkFjY2Vzc0NvZGUiOiI2MjczMSIsIkFjY2Vzc0NvZGVJc3N1ZWRUaW1lIjoiMy85LzIwMTggMToxNjo0MCBQTSIsIkFjY2Vzc0NvZGVFeHBUaW1lIjoiMy8xMC8yMDE4IDE6MTY6NDAgUE0iLCJpc3MiOiJsb2NhbGhvc3QiLCJhdWQiOiJ1c2VycyIsImV4cCI6MTUyMDY4NzgwMCwibmJmIjoxNTIwNjAxNDAwfQ.I4_qpKWUt0um6Nh0Zvr8UGTFIbjW7NGf4Ap6ixKxBYE";
	
	private static ArrayList<AddressFields> getAdresses() {
		
		ArrayList<AddressFields> _adresses = new ArrayList<AddressFields>();
		_adresses.add(new AddressFields("Vova", "3921 Martin Luther King Jr Blvd", "Dallas", "TX", "75210"));
		_adresses.add(new AddressFields("Nathan test", "2727 Al Lipscomb Way", "Dallas", "TX", "75215"));
		_adresses.add(new AddressFields("Nathan test", "1201 E 8th St #302", "Dallas", "TX", "75203"));
		_adresses.add(new AddressFields("Nathan test", "231 W Jefferson Blvd", "Dallas", "TX", "75208"));
		_adresses.add(new AddressFields("Nathan test", "1230 W Davis St", "Dallas", "TX", "75208"));
		_adresses.add(new AddressFields("Nathan test", "3302 Pluto Std", "Dallas", "TX", "75212"));
		return _adresses;
	}
	
	    public static void main(String[] args) throws Exception {
	    	ArrayList<AddressFields> adresses =  getAdresses();
	    	
	        for(AddressFields a: adresses) {
	        	VehicleClaimAssignment vca = VehicleClaimAssignment.getEmpty();
	        	vca.setInsuredName(a.insuredName);
	        	vca.setAddress(a.address);
	        	vca.setCity(a.city);
	        	vca.setState(a.state);
	        	vca.setZipCode(a.zipCode);
	        	
	        	Gson gs = new Gson();
	        	String assignment = gs.toJson(vca);
	        	System.out.println();
	        	createAssignment(assignment);
	        }
	        
	       
	    }
	    
	    // method to connect to navigator and send a request
	    public static void createAssignment(String assignment) throws Exception {
	    	
	    	//create a connection to a given url
	        URL url = new URL("https://navigatormobileservicesuat.cisgroup.net/api/briefcase/autoclaim");
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        
	        connection.setRequestMethod("PUT");
	        connection.setDoOutput(true);
	        connection.setRequestProperty("Content-Type", "application/json");
	        connection.setRequestProperty("Accept", "application/json");
	        connection.setRequestProperty("Authorization", token);
	        connection.setRequestProperty("Host", "navigatormobileservicesuat.cisgroup.net");
	        OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());
	        
	        
	        
	        osw.write(assignment);//JSON body here
	        osw.flush();
	        osw.close();
	        System.err.println(connection.getResponseCode());
	    }
	    
	    
	    
	

}
