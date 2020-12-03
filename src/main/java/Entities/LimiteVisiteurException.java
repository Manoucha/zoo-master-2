package Entities;

public class LimiteVisiteurException extends Exception {
	   String message;
	   LimiteVisiteurException(String str) {
	      message = str;
	   }
	   public String toString() {
	      return ("Exception nombre dépassé declenchée : " + message);
	   }
	}