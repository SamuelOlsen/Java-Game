package Matador;

public class Player extends Field {
	
	String name;
	double account;
	int fieldno;
	int hits;
	
	//konstruktør med navn og konto i parameter
	public Player(String name, double account) {
		
		this.name = name;
		this.account = account;
		this.fieldno = 0;
		
	}
	
	//en besked til spilleren
	public void message(String message) {
		
		System.out.println(name+": "+message);
		
	}
	
	//et ja/nej spørgsmål. Svarer brugeren ja retuneres true, ellers false
	public boolean question(String question) {
		
		String ques = name+": would you "+question+"?";
		String svar = javax.swing.JOptionPane.showInputDialog(ques, "yes");
		System.out.println(ques+" "+svar);
		if(svar != null && svar.equals("yes")) return true;
		else return false;
	}
	
	public void transaktion(double money) {
		
		this.account = account + money;
		System.out.println(name+"s account is now: $"+account);
		
	}
	
	public void pay(Player recipient, double money) {
		
		System.out.println(name+" pays "+recipient.name+": $"+money);
		recipient.transaktion(money);
		transaktion(-money);
		
	}

}
