package testJSon;
import java.util.ArrayList;

public class Members {
	private ArrayList<Persona> membri;
	
	public Members(ArrayList<Persona> persone) {
		membri=persone;
	}
	public void listaMembri() {
		for(int i=0;i<membri.size();i++) {
			System.out.println(membri.get(i).getReal_name());
		}
	}
	
	public String toString() {
		String temp="";
		for(int i=0;i<membri.size();i++) {
			temp=temp+membri.get(i).toString();
		}
		return temp;
	}
}
