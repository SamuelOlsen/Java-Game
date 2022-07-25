package Matador;

public class Field {
	
	String name;    // Feltets navn f.eks. "Rødovrevej"
	
	
	// metoden kaldes når spilleren har passeret et specifikt felt
	public void passingBy(Player sp) {
		
		sp.message("You're passing by "+name);   
		
	}
	
	
	// metoden kaldes når spilleren lander på et specifikt felt
	public void landedOn(Player sp) {
		
		sp.message("You landed on: "+name);   
		
		
	}

}
