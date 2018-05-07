package testJSon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class staticmain {
	public static void main(String[] args) {
		funzioni m=new funzioni();
		String b;
		BufferReader titolo=new BufferReader();
		try {
			titolo.titolo();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner tastiera=new Scanner(System.in);
	do {
		b=tastiera.nextLine();
		if(b.equals("help")){
		  m.help();
		}
		else if(b.equals("memberslist")) { //funzione
		   System.out.println("\n"+"Inserisci workspace"+" "+"\n");
		   String path=tastiera.nextLine();
		       //se troviamo il workspace parte il comando --listmember
		 }
		else if(b.equals("channelslist")) {
		    System.out.println("\n"+"Inserisci workspace"+" "+"\n");
		    String path=tastiera.nextLine(); 
		   //se troviamo il workspace parte il comando --listchannel
		    }
		else if(b.equals("membersforchannel")){
			System.out.println("\n"+"Inserisci workspace"+" "+"\n");
		    String path=tastiera.nextLine(); 
		}
		else if(b.equals("channelmembers")) {
			System.out.println("\n"+"Inserisci workspace"+" "+"\n");
		    String path=tastiera.nextLine(); 
		    System.out.println("\n"+"Inserisci Nome canale"+" "+"\n");
		    String nome=tastiera.nextLine(); 
		}
		 else if(!b.equals("quit")) {
		    m.help();
		 }
	}while(!b.equals("quit")); 
	tastiera.close();
	}
}
