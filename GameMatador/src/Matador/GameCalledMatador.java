package Matador;
import java.util.ArrayList;

public class GameCalledMatador extends Field {
	
	ArrayList<Field> fields = new ArrayList<Field>();
	ArrayList<Player> players = new ArrayList<Player>();
	int playersturn = 0;
	
	public GameCalledMatador() {
		fields.add(new Brewery("Harboe", 15000, 100));
		fields.add(new ShippingCompany("Eastern Shipping co", 40000, 100));
		fields.add(new Brewery("Harboe", 19999, 100));
		fields.add(new Street("New York street", 19999, 100, 1000));
		fields.add(new Brewery("Harboe", 30000, 100));
		fields.add(new ShippingCompany("Western Shipping co", 15000, 100));
		fields.add(new Brewery("Harboe", 25000, 100));
		fields.add(new Street("New York street", 12000, 100, 1000));
	}
	

}
