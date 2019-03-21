public class Main {
	public static final int NUM_CARDS = 52;
	
	public static void main(String args[]) {
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();
		 
		 Card[] deck = new Card[52];
		    
		int x = 0;
			 
		for(Suit suit : suits) {
		     for(Rank rank : ranks) {
		        deck[x] = new Card(suit, rank);
		        x++;
		     }
		 }
		
		//shuffle (algorithm taken from Princeton.edu)
		for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (deck.length-i));
            Card temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
		
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i].toString());
		}
		
		//.valueOf()
			
	}
}