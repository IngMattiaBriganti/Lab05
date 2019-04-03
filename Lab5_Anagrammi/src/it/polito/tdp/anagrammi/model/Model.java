package it.polito.tdp.anagrammi.model;

import java.util.*;

import it.polito.tdp.anagrammi.DAO.*;

public class Model {

	public Map<String, Boolean> cercaAnagrammi(String inserita) {
		
		ParolaDAO pd=new ParolaDAO();
		CercaParola c=new CercaParola();
		Parola p=new Parola(inserita);
		List<Parola> listaAnagrammi=c.generaAnagramma(p);
		return pd.getAnagrammi(listaAnagrammi);
		
	}
}
