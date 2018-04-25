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
		if(b.equals("--help")){
		  m.help();
		}
		else if(b.equals("--memberlist")) { //funzione
		   System.out.println("\n"+"Inserisci workspace"+" "+"\n");
		   String path=tastiera.nextLine();
		       //se troviamo il workspace parte il comando --listmember
		   	   Members temp=new Members();
		   	   temp.acquisisci(path);
		   	   temp.listaMembri();
		 }
		else if(b.equals("--channellist")) {
		    System.out.println("\n"+"Inserisci workspace"+" "+"\n");
		    String path=tastiera.nextLine(); 
		   //se troviamo il workspace parte il comando --listchannel
		    Channels temp=new Channels();
		    temp.acquisisci(path);
		    temp.listaCanali();
		    }
		else if(b.equals("memberforchannel")){
			System.out.println("\n"+"Inserisci workspace"+" "+"\n");
		    String path=tastiera.nextLine(); 
		    Channels temp=new Channels();
		    temp.acquisisci(path);
		    temp.membriPerChannel(path);
		}
		else if(b.equals("channelmembers")) {
			System.out.println("\n"+"Inserisci workspace"+" "+"\n");
		    String path=tastiera.nextLine(); 
		    System.out.println("\n"+"Inserisci Nome canale"+" "+"\n");
		    String nome=tastiera.nextLine(); 
		    Channels temp=new Channels();
		    temp.acquisisci(path);
		    temp.membridiunchannel(nome, path);
		}
		 else if(!b.equals("quit")) {
		    m.help();
		 }
	}while(!b.equals("quit")); 
	tastiera.close();
	}
}
