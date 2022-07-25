package Matador;

public class Brewery extends Ground {
	
	double groundRent;


	public Brewery(String name, double price, double rent) {
		
		super(name, price, rent);
		this.groundRent = rent;
	
	}

	@Override
	public double calculateRent(Player sp) {
		
		double endResult = groundRent*this.sp.hits;
		return endResult;
		
	}

	@Override
	public void landedOn(Player sp) {

		super.landedOn(sp);
		
	}
	
	
	
}
