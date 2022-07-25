package Matador;

public class UseTheGame {

	public static void main(String[] args) {
		
		GameCalledMatador game = new GameCalledMatador();
		game.players.add(new Player("Samuel",60000));
		game.players.add(new Player("Sofie", 60000));
		
		
		for(game.playersturn = 0; game.playersturn<40; game.playersturn++) {
			
			Player sp = game.players.get(game.playersturn % game.players.size());
			sp.hits = (int) ((Math.random()*6)+1);
			System.out.println("***** "+sp.name+" on field "+sp.fieldno+" gets "+sp.hits);
			
			for(int i = 0; i <= sp.hits; i++) {
				
				sp.fieldno = sp.fieldno+1;
				
				if(sp.fieldno == game.fields.size()) sp.fieldno = 0;
				Field felt = game.fields.get(sp.fieldno);
				
				if(i<sp.hits) felt.passingBy(sp);
				else felt.landedOn(sp);
				
				try {
					Thread.sleep(300);
				}
				catch(Exception e) {
					
				}
				
				
			}
			try {
				Thread.sleep(300);
			}
			catch(Exception e) {
				
			}
			
			
		}
		
		
	}

}
