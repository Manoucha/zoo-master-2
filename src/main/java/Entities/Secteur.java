package Entities;
import java.util.*; 


public class Secteur {

	typeAnimal typeAnimauxDansSecteur ; 
	List<Animal> animauxDansSecteur = new ArrayList<Animal>() ;
	
	
	
	public Secteur(typeAnimal typeAnimauxDansSecteur, List animauxDansSecteur) {
		super();
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
		this.animauxDansSecteur = animauxDansSecteur;
	}
	public typeAnimal getTypeAnimauxDansSecteur() {
		return typeAnimauxDansSecteur;
	}
	public void setTypeAnimauxDansSecteur(typeAnimal typeAnimauxDansSecteur) {
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
	}
	public List getAnimauxDansSecteur() {
		return animauxDansSecteur;
	}
	public void setAnimauxDansSecteur(List animauxDansSecteur) {
		this.animauxDansSecteur = animauxDansSecteur;
	} 
	public void ajouterAnimal(Animal a)
	{
		this.animauxDansSecteur.add(a);
	}
	public int getNombreAnimaux()
	{
		return this.animauxDansSecteur.size();
	}
	public String obtenirType()
	{
		return this.typeAnimauxDansSecteur.toString();
	}
	
	
}
