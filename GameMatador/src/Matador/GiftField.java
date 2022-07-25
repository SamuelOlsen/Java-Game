package Matador;

public class GiftField extends Field {

	double gift;
	
	public GiftField(int gift) {
		
		name = "Gift field";                //navn er arvet fra Felt
		this.gift = gift;
		
	}

	@Override
	public void landedOn(Player sp) {   //override LandetPå metoden fra Felt
		
		sp.message("You landed on 'gift field' and gets: "+gift);
		
		sp.transaktion(gift);        	//opdater spillers konto
		
	}
	
	

}
