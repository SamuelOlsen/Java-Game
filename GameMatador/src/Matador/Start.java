package Matador;

public class Start extends Field {
	
	double gift;
	
	public Start(double gift) {
		
		name = "Start";
		this.gift = gift;
		
	}

	@Override
	public void passingBy(Player sp) {          //override metoden passeret fra Felt
		
		sp.message("You're passing 'START' and gets: "+gift);
		sp.transaktion(gift);
		
	}

	@Override
	public void landedOn(Player sp) {          //override metoden LandetPå fra Felt
		
		sp.message("You landed on 'START' and gets: "+gift);
		sp.transaktion(gift);
	}
	
	

}
