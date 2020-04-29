package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.polito.tdp.anagrammi.DAO.ParoleDAO;

public class Model {
	
	ParoleDAO paroleDAO =new ParoleDAO();
	public Set<String> anagramma(String parola){
		Set<String> anagrammi= new HashSet<String>();
		
		List<Character> disponibili = new ArrayList<Character>();
		for(Character c: parola.toCharArray())disponibili.add(c);
		//for(int i=0;i<parola.length();i++) {disponibili.add(parola.charAt(i));}
		String parziale="";
		calcola(parziale,0,disponibili,anagrammi);
		return anagrammi;
		
		
		
		
	}
	private void calcola(String parziale, int livello, List<Character> disponibili,Set<String> anagrammi) {
		
		if(disponibili.size()==0) {
			anagrammi.add(parziale);
			
			
		}
		for(Character c:disponibili) {
			String tentativo =parziale+c; //fondamentale
			List<Character> rimanenti = new ArrayList<Character>(disponibili);
			
			rimanenti.remove(c);
			calcola(tentativo,livello+1,rimanenti,anagrammi);
			
			
		}
		
		
	}
		
	public boolean esistente(String parola){
		
		return paroleDAO.esistente(parola);
	}	

}
