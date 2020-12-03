package Entities;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws LimiteVisiteurException {
		// TODO Auto-generated method stub
		
			Zoo zoo = new Zoo(0, new ArrayList<Secteur>());
			zoo.nouveauVisiteur();
			zoo.nouveauVisiteur();
			zoo.nouveauVisiteur();
			zoo.nouveauVisiteur();
			
			if(zoo.getVisiteurs() > zoo.getLimiteVisiteur()) throw new LimiteVisiteurException("ouuuups");
	}

}
