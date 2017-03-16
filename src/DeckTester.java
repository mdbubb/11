/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String r[] = {"King", "Ace", "Jack"};
        String s[] = {"Heart", "Diamond", "Spades"};
        int v[] = {13, 1, 11};


        Deck deck = new Deck(r, s, v);
        System.out.println(deck.deal());
        System.out.println(deck.toString());
        //Deck deck1= new Deck();
        //Deck deck2 = new Deck();

    }
}
