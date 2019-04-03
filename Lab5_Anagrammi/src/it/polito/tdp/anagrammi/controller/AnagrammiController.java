
package it.polito.tdp.anagrammi.controller;

	import java.net.URL;
import java.util.List;
import java.util.Map.Entry;
import java.util.*;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;

	public class AnagrammiController {

		private Model model;
	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField txtInserito;

	    @FXML
	    private Button btnCalcolaAnagrammi;

	    @FXML
	    private TextArea txtAreaCorretti;

	    @FXML
	    private TextArea txtAreaSbagliati;

	    @FXML
	    private Button btnReset;

	    @FXML
	    void doCalcolaAnagramma(ActionEvent event) {
	    	String inserita=this.txtInserito.getText().toLowerCase();
	    	Map<String,Boolean> risultati=new HashMap<String,Boolean>();
	    	
			if(inserita.compareTo("")==0 || inserita==null || !inserita.matches("[a-zA-Z]*"))
	    		this.txtAreaSbagliati.appendText("ERRORE: inserita stringa\n");
	    	else {
	    		risultati=model.cercaAnagrammi(inserita);
	    		
	    		for(Entry<String,Boolean> s:risultati.entrySet()) {
	    			if((boolean) s.getValue())
	    				this.txtAreaCorretti.appendText((String) s.getKey()+"\n");
	    			else 
	    				this.txtAreaSbagliati.appendText((String) s.getKey()+"\n");
	    		}
	    	}
			
	    }

	    @FXML
	    void doReset(ActionEvent event) {
	    	this.txtInserito.clear();
	    	this.txtAreaCorretti.clear();
	    	this.txtAreaSbagliati.clear();

	    }

	    @FXML
	    void initialize() {
	        assert txtInserito != null : "fx:id=\"txtInserito\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert btnCalcolaAnagrammi != null : "fx:id=\"btnCalcolaAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert txtAreaCorretti != null : "fx:id=\"txtAreaCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert txtAreaSbagliati != null : "fx:id=\"txtAreaSbagliati\" was not injected: check your FXML file 'Anagrammi.fxml'.";
	        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

	    }

		

		public void setModel(Model model) {
			this.model = model;
		}
	    
	    
	}



