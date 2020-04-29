package model;

public class TestModel {

	public static void main(String[] args) {
		

		
			Model model=new Model();
			
			int counter=0;
			//model.anagramma("cane");
			for(String s: model.anagramma("cane")) {
				if(model.esistente(s)) 
				System.out.println(counter+" esistente- "+s);
				else System.out.println(counter+" non esistente- "+s);
				counter++;
			
			
			} 
		}

	

}
