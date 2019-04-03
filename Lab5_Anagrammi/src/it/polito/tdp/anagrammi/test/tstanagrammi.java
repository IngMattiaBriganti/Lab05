package it.polito.tdp.anagrammi.test;

import it.polito.tdp.anagrammi.model.CercaParola;
import it.polito.tdp.anagrammi.model.Parola;

public class tstanagrammi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			CercaParola c=new CercaParola();
			
			for(Parola tempc:c.generaAnagramma(new Parola("abc"))) {
			System.out.println(""+tempc.getCaratteri()+" ");
			}
			

		
	}

}
