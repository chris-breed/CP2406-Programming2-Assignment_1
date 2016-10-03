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

        return null;
    }
}
