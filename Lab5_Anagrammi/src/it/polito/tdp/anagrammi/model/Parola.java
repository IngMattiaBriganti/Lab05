package it.polito.tdp.anagrammi.model;

import java.util.*;

public class Parola {
	private String caratteri;
	private int size;
	private Map<Character, Integer> contatori;
	
	

	public Parola(String caratteri) {
		super();
		this.caratteri = caratteri;
		this.size = caratteri.trim().length();
		contatori=new HashMap<Character,Integer>();
		
	}


	public String getCaratteri() {
		return caratteri;
	}


	public void setCaratteri(String caratteri) {
		this.caratteri = caratteri;
	}
	

	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	


	public boolean contains(String parola,char Z) {
		int contatoreParola=0;
		int contatoreAnagramma=0;
		for(int i=0;i<parola.length();i++) {
			 if(parola.charAt(i)==Z)
				contatoreParola++;
		}
		for(int i=0;i<this.caratteri.length();i++) {
			if(caratteri.charAt(i)==Z)
				contatoreAnagramma++;
		}	
		if(contatoreParola>contatoreAnagramma)
			return true;
		else if(contatoreParola==contatoreAnagramma)
			return false;
		return false;
	}
//		for(int i=0;i<parola.length();i++) { //MAPPA CONTATORI PAROLA INIZIALE
//			char c=parola.charAt(i);
//			int j=0;
//			if(!contatori.containsKey(c)) 
//				contatori.put(c, 1);
//				
//			else {
//				j=contatori.get(c);
//				j=j++;
//				contatori.remove(c);
//				contatori.put(c, j);
//			}
//		}
//		for(int i=0;i<caratteri.length();i++) { //MAPPA CONTATORI PAROLA PARZIALE
//			int j=0;
//			char c=caratteri.charAt(i);
//			if(contatori.containsKey(c)) {
//				j=contatori.get(c);
//				j=j--;
//				contatori.remove(c);
//				contatori.put(c, j);
//				}
//				
//		}
//		
//		
//		if(contatori.get(Z)==0)
//			return false;
//		else if(contatori.get(Z)>0)
//			return true;
//		return false;
//		}


	@Override
	protected Parola clone() {
		Parola p=new Parola("");
		p.setCaratteri(this.caratteri);
		
		return p;
	}
	}

//	public boolean isValid() {
//
//		
//		return false;
//	}


	
