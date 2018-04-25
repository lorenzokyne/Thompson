package testJSon;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Channels {
	private ArrayList<Channel> canali;
	
	public void listaCanali() {
		for(int i=0;i<canali.size();i++) {
			System.out.println(canali.get(i).getName());
		}
	}
	
	public String trovaNome(String codice,Members utenti) {
		return utenti.getRealName(codice);
	}
	
	public void stampaMembri(String membri[],String path) {
		Members utenti=new Members();
		utenti.acquisisci(path);
		for(int i=0;i<membri.length;i++) {
			System.out.println("	"+trovaNome(membri[i],utenti)+",");
		}
	}
	
	public void membriPerChannel(String path) {
		for(int i=0;i<canali.size();i++) {
			System.out.println(canali.get(i).getName()+":[\n");
			stampaMembri(canali.get(i).getMembers(),path);
			System.out.println("],");
		}
		
	}
	
	public void membridiunchannel(String nomeChannel,String path) {
		for(int i=0;i<canali.size();i++) {
			if(canali.get(i).getName().equals(nomeChannel)) {
				stampaMembri(canali.get(i).getMembers(),path);
			}
		}
	}
	
	public void acquisisci(String path) {
		JSONParser parser = new JSONParser();
		try {  
			Gson a=new Gson();
	        Object obj = parser.parse(new FileReader("channels.json"));
	        JSONArray jsonArray =  (JSONArray) obj;
	        String temp=jsonArray.toString();
	        java.lang.reflect.Type listType = new TypeToken<ArrayList<Channel>>() {}.getType();
	        canali=a.fromJson(temp,listType);
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
		for(int i=0;i<canali.size();i++) {
			temp=temp+canali.get(i).toString();
		}
		return temp;
	}
	
}
