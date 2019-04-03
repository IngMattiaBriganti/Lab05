package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import it.polito.tdp.anagrammi.model.Parola;


public class ParolaDAO {


	public Map<String, Boolean> getAnagrammi(List<Parola> anagrammi) {

		Map<String,Boolean> risultati=new HashMap<String,Boolean>();
		
		for(Parola temp:anagrammi) {
		
		String sql=	" SELECT * " + 
				" FROM parola p " + 
				" WHERE p.nome LIKE ? ";
	
	
			try {
				Connection conn = ConnectDB.getConnection();
				PreparedStatement st = conn.prepareStatement(sql);
				st.setString(1,temp.getCaratteri());
				ResultSet rs = st.executeQuery();
				
				risultati.put(temp.getCaratteri(),false);
				while (rs.next()) {
				risultati.put(temp.getCaratteri(),true);
				}
				
				conn.close();
			
	
			} catch (SQLException e) {
				 e.printStackTrace();
				throw new RuntimeException("Errore Db");
			}
		
		
	}	
	
		return risultati;
	}
	
	

}
