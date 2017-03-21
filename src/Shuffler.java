import java.util.ArrayList;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 1;


    /**
     * Tests shuffling methods.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     *
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
        ArrayList one = new ArrayList();
        ArrayList two = new ArrayList();
        int finala [] = new int[4];
        int val=0;
        for(int i=0; i<values.length; i++){
            if(values[i]%2==0){
                one.add(values[i]);
            }
            else{
                two.add(values[i]);
            }
        }
        for(int i =0; i<one.size();i++){
            System.out.print(one.get(i));


        }
        System.out.println();
        for(int i =0; i<one.size();i++){
            System.out.print(two.get(i));


        }
       finala[0] = (int ) one.get(0);
        finala[1] = (int ) two.get(1);
        values[0] = finala[0];
        values[1] = finala[1];


        /*for(int i=0; i<one.size(); i++) {
            int a= (int) one.get(i);
            int b = (int) one.get((one.size()-i)-1);
            one.remove(i);
            one.add(i,b);
            one.remove((one.size()-i)-1);
            one.add((one.size()-i)-1,a);
            values[val]= (int) one.get(i);
            val++;
        }
        for(int i=0; i<two.size(); i++) {
            int a= (int) two.get(i);
            int b = (int) two.get((two.size()-i)-1);
            two.remove(i);
            two.add(i,b);
            two.remove((two.size()-i)-1);
            two.add((two.size()-i)-1,a);
            values[val]= (int) two.get(i);
            val++;
        }*/

    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     *
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
    }
}
