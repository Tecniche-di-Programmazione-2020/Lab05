package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Model;

public class FXMLController {
	private Model model;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField inputParola;

    @FXML
    private TextArea outputCorretto;

    @FXML
    private TextArea outputErrato;

    @FXML
    void doCerca(ActionEvent event) {
    	outputCorretto.clear();
    	outputErrato.clear();
    	Set<String> elenco =model.anagramma(inputParola.getText());
    	for(String s:elenco) {
    		if(model.esistente(s)) {outputCorretto.appendText(s+"\n");}
    		else {outputErrato.appendText(s+"\n");}
    	}

    }

    @FXML
    void doReset(ActionEvent event) {
    	inputParola.clear();
    	outputCorretto.clear();
    	outputErrato.clear();

    }
    public void setModel(Model model) {
    	this.model = model;
    	configurazioneIniziale();
    }
    private void configurazioneIniziale(){
        //Operazioni preliminari
    }

    @FXML
    void initialize() {
        assert inputParola != null : "fx:id=\"inputParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert outputCorretto != null : "fx:id=\"outputCorrettp\" was not injected: check your FXML file 'Scene.fxml'.";
        assert outputErrato != null : "fx:id=\"outputErrato\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
