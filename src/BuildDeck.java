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

        if (i == 0) {
            cards[0] = "Slide01.jpg";
            cards[1] = "Slide01";
            cards[2] = "play";
            cards[3] = "Quartz";
            cards[4] = "SiO_2";
            cards[5] = "tectosilicate";
            cards[6] = "hexagonal";
            cards[7] = "igneous, metamorphic, sedimentary";
            cards[8] = "7";
            cards[9] = "2.65";
            cards[10] = "poor/none";
            cards[11] = "high";
            cards[12] = "moderate";
        } else {
            cards[0] = "Slide02.jpg";
            cards[1] = "Slide02";
            cards[2] = "play";
            cards[3] = "Plagioclase";
            cards[4] = "Na Al Si_3 O_8 - Ca Al_2 Si_2 O_8";
            cards[5] = "tectosilicate";
            cards[6] = "triclinic";
            cards[7] = "igneous, metamorphic, sedimentary";
            cards[8] = "6 - 6.5";
            cards[9] = "2.6 - 2.8";
            cards[10] = "1 perfect, 1 good";
            cards[11] = "very high";
            cards[12] = "moderate";
        }

        return cards;
    }
}
