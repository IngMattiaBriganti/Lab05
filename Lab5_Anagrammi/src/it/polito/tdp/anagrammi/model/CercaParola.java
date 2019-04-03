package it.polito.tdp.anagrammi.model;

import java.util.*;


public class CercaParola {
	private List<Parola> soluzioni;
	
	public List<Parola> generaAnagramma(Parola inserita){
		soluzioni= new LinkedList<Parola>();
		Parola parziale = new Parola("");
		int L=0;
		this.cerca(parziale,inserita, L);
		return soluzioni;
		
	}

	private void cerca(Parola parziale,Parola inserita, int L) {
		
		
			if(L==inserita.getSize()) {
				
				soluzioni.add(parziale.clone());
				
				
			}
			
		for(int i=0;i<inserita.getSize();i++) {
			
			char c=inserita.getCaratteri().charAt(i);
			
			if(parziale.contains(inserita.getCaratteri(),c)) {

				parziale.setCaratteri(parziale.getCaratteri()+c);
				
				cerca(parziale,inserita,L+1);
				
				parziale.setCaratteri(parziale.getCaratteri().substring(0,parziale.getCaratteri().length()-1));
			}
		}
	}

}
