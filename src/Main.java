import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		System.out.println("Name: ");
	    Scanner scan = new Scanner(System.in);
	    String name = scan.nextLine();
	    System.out.println("Hello, "+name+", welcome to BlackJack");
	    System.out.println("Cash: ");
	    Scanner money = new Scanner(System.in);
	    int cash = money.nextInt();
	    System.out.println("You start with cash: "+cash);
	    
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
		
		int test = deck[4].getRank().getValue();
		System.out.print(test);
		
		scan.close();
	}
	
	public static void Win()
	{
	    System.out.println("Congratulations, you win!");
	    int cash = cash+bet;
	    System.out.println("Cash: "+cash);
	}
}