package Matador;

public class Ground extends Field {
	
	Player owner;
	double price;
	double groundRent;
	Player sp;
	
	public Ground(String name, double price, double rent) {
		
		this.name = name;
		this.price = price;
		this.groundRent = rent;
	}
	
	public double calculateRent(Player sp) {
		this.sp = sp;
		return groundRent;
		
	}

	@Override
	public void landedOn(Player sp) {
			this.sp = sp;
			sp.message("You landed on: "+name);
			if(sp==owner) {
				
				sp.message("It's your own property");
			}
			else if(owner==null) {
				
				if(sp.account>price) {
					
					if(sp.question("by "+name+" for "+price)) {
						sp.transaktion(-price);
						owner=sp;
					}
					
				}
				else sp.message("You do not have enough money to buy: "+name);
				
			}
			else {
				
				double rent = calculateRent(sp);
				sp.message("Rent: "+rent);
				sp.pay(owner, rent);
				
			}
			
		

	}

	
	
}
