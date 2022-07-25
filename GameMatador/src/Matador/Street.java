package Matador;

public class Street extends Ground {
	
	int amountHouse;
	double housePrice;
	
	public Street(String name, double price, double rent, double housePrice) {
		
		super(name, price, rent);
		this.housePrice = housePrice;
		amountHouse = 0;
		
	}

	
	public double calculateRent() {

		return groundRent + amountHouse*housePrice;
		
	}

	
	public void LandedOn(Player sp) {
		
		super.landedOn(sp);
		
		if(sp==owner) {
			
			if(amountHouse<5 && sp.account>price && sp.question("by a house for "+price)) {
				
				owner.transaktion(-housePrice);
				amountHouse = amountHouse+1;
				sp.message("You are building a house on "+name+" for "+housePrice);
				
			}
			
		}
		
		
	}
	
	

}
