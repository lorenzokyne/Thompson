package testJSon;
import java.util.ArrayList;

public class Channels {
	private ArrayList<Channel> canali;
	
	public Channels(ArrayList<Channel> a) {
		canali=a;
	}
	
	public void listaCanali() {
		for(int i=0;i<canali.size();i++) {
			System.out.println(canali.get(i).getName());
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
