public class Main {
	public static final int NUM_CARDS = 52;
	
	public static void main(String args[]) {
		Suit jeff = Suit.SPADES; 
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		 Suit[] suits = {jeff} ;
		 
		 Card[] deck;
		    
			int i = 0;
			 
			for(Suit suit : suits) {
			     for(String rank : ranks) {
			        deck[i++] = new Card(suits, rank);
			     }
			 }
	}
}