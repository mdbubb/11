/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card = new Card("Queen", "Spades" , 12);
		Card card1 = new Card("King", "Dimonds" , 13);
		Card card2 = new Card("King","Dimonds",13 );


		System.out.println(card.rank());
		System.out.println(card.suit());
		System.out.println(card.pointValue());
		System.out.println(card.matches(card1));
		System.out.println(card.toString() +"\n"+"\n");


		System.out.println(card1.rank());
		System.out.println(card1.suit());
		System.out.println(card1.pointValue());
		System.out.println(card1.matches(card2));
		System.out.println(card1.toString()+"\n"+"\n");


		System.out.println(card2.rank());
		System.out.println(card2.suit());
		System.out.println(card2.pointValue());
		System.out.println(card2.matches(card));
		System.out.println(card2.toString());


	}}
