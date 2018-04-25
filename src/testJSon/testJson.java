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


public class testJson{
	
	public static void main(String[]args) {
		/*JSONParser parser = new JSONParser();
		try {   
			Gson a=new Gson();
	        Object obj = parser.parse(new FileReader("users.json"));
	        JSONArray jsonArray =  (JSONArray) obj;
	        String temp=jsonArray.toString();
	        java.lang.reflect.Type listType = new TypeToken<ArrayList<Persona>>() {}.getType();
	        Members utenti=new Members(a.fromJson(temp,listType));
	       // System.out.println(utenti.toString());
	        utenti.listaMembri();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }*/
			
	}
}
