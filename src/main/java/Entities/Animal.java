package Entities;

public abstract class Animal {


	
	String nomAnimal;
	typeAnimal type;
	
	
	
	 abstract public String getNomAnimal();
	 
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	public typeAnimal getType() {
		return type;
	}
	public void setType(typeAnimal type) {
		this.type = type;
	}
	
	
	
}
