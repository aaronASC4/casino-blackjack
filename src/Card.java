public class Card
{
    private Suit suits;
    private Rank rank;
    
    public Card(Suit suits, Rank rank) {
    	this.suits = suits;
    	this.rank = rank;
	}
    
   public Suit getSuit() {
	   return suits;
   }
   
   public Rank getRank() {
	   return rank;
   }
   
   @Override
   public String toString() {
	   
	   return  this.rank + " of " + this.suits.toString();
	   
   }
}
