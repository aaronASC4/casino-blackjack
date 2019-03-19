public class Card
{
    private Suit suits;
    private String value;
	public static final int NUM_CARDS = 52;
    
    public Card(Suit suits, String value) {
    	this.suits = suits;
    	this.value = value;
	}
    
   public Suit getSuit() {
	   return suits;
   }
   
   public String getValue() {
	   return value;
   }
}
