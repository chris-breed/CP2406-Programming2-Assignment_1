import com.dd.plist.*;
import java.io.*;

import java.io.File;

public class BuildDeck {

    private static File fileInput = new File("/MstCards_151021.plist");

    public static void main(String[] args) {




        String[][] buildDeck = new String[60][13]; //60 cards, 13 values for each card
        buildDeck = getDeck();

        for (int i = 0; i <= buildDeck.length; i++) {
            System.out.println(buildDeck[0][i]);
        }

    }

    private static String[][] getDeck() {
        String[][] deck = new String[60][13];

        for (int i = 0; i <= 1; i++) {
            deck[i] = buildCard(i);
        }
        return deck;
    }

    private static String[] buildCard(int i) {

        Card cards1 = new Card("Slide01");
        Card cards2 = new Card("Slide02");

        System.out.println(cards1.printFileName());
        System.out.println(cards2.printFileName());

        NSDictionary d = null;
        try {
            d = (NSDictionary) PropertyListParser.parse(fileInput);
        } catch (Exception e) {
            //ignore.
        }

        System.out.println(d);
        return null;
    }
}
