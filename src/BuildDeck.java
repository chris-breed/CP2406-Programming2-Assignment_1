public class BuildDeck {
    public static void main(String[] args) {
        String[][] buildDeck = new String[60][13]; //60 cards, 13 values for each card
        buildDeck = getDeck();

        for (int i = 0; i <= buildDeck.length; i++) {
            System.out.println(buildDeck[0][i]);
        }

        for (int o = 0; o <= buildDeck.length; o++) {
            System.out.println(buildDeck[1][o]);
        }
    }

    private static String[][] getDeck() {
        String[][] deck = new String[60][13];

        for (int i = 0; i <= 1; i++) {
            deck[1] = getCards(1);
        }
        return deck;
    }

    private static String[] getCards(int i) {
        String[] cards = new String[13];

        return cards;
    }
}
