public class CardTrump{

    public static void main(String[] args) {
        for (int i = 1; i < 60; i++) {
            String string = String.format("deck.add(new Card(ParsePList.deck.get(%s).split(\"\\u200B\")));", i);
            System.out.println(string);
        }
    }
}