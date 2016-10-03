public class TrumpCard {

    public static void main(String[] args) {
//        Card card1 = new Card(deck.get(0).split(","));


        for (int i = 1; i < 60; i++) {
            String string = String.format("Card card%s = new Card(deck.get(%s).split(\"\u200B\"));", i, i - 1);
            System.out.println(string);
        }
    }
}