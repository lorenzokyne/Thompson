package graficaint;

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
	
	do {
		 Scanner tastiera=new Scanner(System.in);
	     b=tastiera.nextLine();
	      System.out.println(b);
	            if(b.equals("--help")){
	    	      m.help();
	            }
	    	    else if(b.equals("--listmember")) { //funzione
	    		   System.out.println("\n"+"Inserisci workspace"+" "+"\n");
	    		   //String nomeW=tastiera.nextLine();
	    		       //se troviamo il workspace parte il comando --listmember
	             }
	    	    else if(b.equals("--listchannel")) {
	    		    System.out.println("\n"+"Inserisci workspace"+" "+"\n");
 		            //String nomeW1=tastiera.nextLine(); 
 		           //se troviamo il workspace parte il comando --listchannel
	    		    }
	    		 else if(!b.equals("--quit") && !b.equals("--listmember") && !b.equals("--listchannel") && !b.equals("--help")) {
                    m.help();
	    		 }
	            //tastiera.close();
	}while(!b.equals("--quit")); 
}

}
