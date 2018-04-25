package testJSon;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;

public class Members {
	private ArrayList<Persona> membri;

	public void listaMembri() {
		for(int i=0;i<membri.size();i++) {
			System.out.println(membri.get(i).getReal_name());
		}
	}
	
	public void acquisisci(String path) {
		JSONParser parser = new JSONParser();
		try {   
			Gson a=new Gson();
	        Object obj = parser.parse(new FileReader("users.json"));//TO DO utilizzare la variabile path
	        JSONArray jsonArray =  (JSONArray) obj;
	        String temp=jsonArray.toString();
	        java.lang.reflect.Type listType = new TypeToken<ArrayList<Persona>>() {}.getType();
	        membri=a.fromJson(temp,listType);
	       // System.out.println(utenti.toString());
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	}
	
	public String toString() {
		String temp="";
		for(int i=0;i<membri.size();i++) {
			temp=temp+membri.get(i).toString();
		}
		return temp;
	}
	
	public String getId(int index) {
		return membri.get(index).getId();
	}
	
	public String getRealName(String codice) {
		for(int i=0;i<membri.size();i++) {
			if(membri.get(i).getId().equals(codice))
				return membri.get(i).getReal_name();
		}
		return null;
	}
	
	public String getRealName(int index) {
		return membri.get(index).getReal_name();
	}
}
