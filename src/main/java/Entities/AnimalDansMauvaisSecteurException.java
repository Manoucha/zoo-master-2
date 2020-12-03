package Entities;

public class AnimalDansMauvaisSecteurException extends Exception {
	   String message;
	   AnimalDansMauvaisSecteurException(String str) {
	      message = str;
	   }
	   public String toString() {
	      return ("Exception animal dans mauvais secteur declenchée : " + message);
	   }
	}