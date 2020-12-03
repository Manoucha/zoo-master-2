package Entities;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	static int visiteurs;
	List<Secteur> secteurAnimaux = new ArrayList<Secteur>() ;
	
	
	
	
	
	
	public Zoo(int visiteurs, List<Secteur> secteurAnimaux) {
		super();
		this.visiteurs = visiteurs;
		this.secteurAnimaux = secteurAnimaux;
	}
	public int getVisiteurs() {
		return visiteurs;
	}
	public void setVisiteurs(int visiteurs) {
		this.visiteurs = visiteurs;
	}
	public List<Secteur> getSecteurAnimaux() {
		return secteurAnimaux;
	}
	public void setSecteurAnimaux(List<Secteur> secteurAnimaux) {
		this.secteurAnimaux = secteurAnimaux;
	}

	public void ajouterSecteur(String s)
	{
		if(s.equals("chien"))
		{
			this.secteurAnimaux.add(new Secteur(typeAnimal.chien, new ArrayList<Animal>()));

		}else if(s.equals("chat"))
		{
			this.secteurAnimaux.add(new Secteur(typeAnimal.chat, new ArrayList<Animal>()));

		}
	}
	public void nouveauVisiteur()
	{
		this.visiteurs++;
	}
	public int getLimiteVisiteur()
	{
		return 2;
	}
	public void nouvelAnimal(Animal a)
	{
		if(a.nomAnimal.equals("chat"))
		{
			 for(int i=0; i<this.secteurAnimaux.size(); i++)
			 {
				 if(secteurAnimaux.get(i).typeAnimauxDansSecteur.equals("chat"))
				 {
					 this.secteurAnimaux.get(i).animauxDansSecteur.add(a);
					
				 }
			 }
		}else if(a.nomAnimal.equals("chien"))
		{
			 for(int i=0; i<this.secteurAnimaux.size(); i++)
			 {
				 if(secteurAnimaux.get(i).typeAnimauxDansSecteur.equals("chien"))
				 {
					 this.secteurAnimaux.get(i).animauxDansSecteur.add(a);
					
				 }
			 }
		}
	}
	public int nombreAnimaux()
	{
		int somme=0;
		for(int i=0; i<this.secteurAnimaux.size(); i++)
		 {
			somme += this.secteurAnimaux.get(i).getNombreAnimaux();
			
		 }
	return somme;
	}
	
}
