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


        //first deck object

        System.out.println("Deck object number 1:");
        String r[] = {"King", "Ace", "Jack"};
        String s[] = {"Heart", "Diamond", "Spades"};
        int v[] = {13, 1, 11};
        Deck deck = new Deck(r, s, v);
        System.out.println(deck.deal());
        System.out.println(deck.toString()+"\n \n \n");

        //second deck object
        System.out.println("Deck Object number 2:");
        String r1[] = {"Eight", "Queen", "five"};
        String s1[] = {"Clubs", "Diamond", "Heart"};
        int v1[] = {8, 12, 5};
        Deck deck1= new Deck(r1,s1,v1);
        System.out.println(deck1.deal());
        System.out.println(deck1.toString()+"\n \n \n");

        //third deck object
        System.out.println("Deck Object number 3:");
        String r2[] = {"Ace", "three", "ten"};
        String s2[] = {"Clubs", "Spades", "Heart"};
        int v2[] = {1, 3, 10};
        Deck deck2= new Deck(r1,s1,v1);
        System.out.println(deck2.deal());
        System.out.println(deck2.toString()+"\n \n \n");




        //Deck deck2 = new Deck();

    }
}
