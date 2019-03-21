public class Card
{
    private Suit suits;
    private Rank value;
    
    public Card(Suit suits, Rank value) {
    	this.suits = suits;
    	this.value = value;
	}
    
   public Suit getSuit() {
	   return suits;
   }
   
   public Rank getValue() {
	   return value;
   }
   
   @Override
   public String toString() {
	   
	   return  this.value + " of " + this.suits.toString();
	   
   }
}
