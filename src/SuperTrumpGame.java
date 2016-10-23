import jdk.internal.org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class SuperTrumpGame extends JFrame {

    private static int playerCount;
    private static ArrayList<String> playingDeck = new ArrayList<String>();
    private static ArrayList<String> shuffledDeck = new ArrayList<>();
    //ArrayLists for players hands
    public static ArrayList<String> playerHand = new ArrayList<>();
    public static ArrayList<String> botHand = new ArrayList<>();
    public static ArrayList<String> botHand2 = new ArrayList<>();
    public static ArrayList<String> botHand3 = new ArrayList<>();
    public static ArrayList<String> botHand4 = new ArrayList<>();
    public ArrayList<Integer> players = new ArrayList<Integer>(3);

    private SuperTrumpGame() {
        super("SuperTrump - Game");
        setSize(1280, 720);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel game = new JPanel();

        JLabel numberPlayers = new JLabel(playerCount + " players");

        game.add(numberPlayers);
        add(game);

    }

    static void main(int pcount) throws SAXException, ParserConfigurationException, org.xml.sax.SAXException, ParseException, IOException {
        /*if start -
        ask user how many players there are (1 user player, between 3 and 4 bots)
        start game
        randomly select dealer
        randomly distribute the cards*/
        boolean running = false;
        playerCount = pcount;

        //initialised deck
        try {
//            String[] args = new String[2];
            String[] args = new String[2];
            ParsePList.main(args);
            System.out.println("debug - deck initialised");
        } catch (SAXException | ParseException | org.xml.sax.SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }
        initializeGame();
        new SuperTrumpGame().setVisible(true);
    }

    private static void initializeGame() {
//        checkPlayerCount();
        selectDealer();
        //deal out cards from the deck (from ParsePlist.class) 8 cards to each

        dealCards(playerCount);
        //clone deck and shuffle the clone
        //deal out cards round robin from the end of the arrayList to each person
        //remove cards that get dealt
    }

//    private static int checkPlayerCount() {
//        playerCount = getPlayerCount();
//
//        while (playerCount < 3 && playerCount < 5) {
//
//            System.out.println("\n\n\n\n\n\nEnter a number of players between 3 and 5 (including the player)");
//            playerCount = getPlayerCount();
//        }
//        String playersArray[] = new String[playerCount];
//
//        return playerCount;
//    }

//    private static int getPlayerCount() {
//        int noPlayers;
//        Scanner menuSelection = new Scanner(System.in);
//        System.out.println("How many players are there? (Between 3 and 5)");
//        noPlayers = menuSelection.nextInt();
//
//        return noPlayers;
//    }

    private static int selectDealer() {
        return new Random().nextInt(playerCount);
    }

    private static void dealCards(int playerCount) {
        //clone to the playing deck
        for (int i = 0; i < ParsePList.deck.size(); i++) {
            if (!ParsePList.deck.get(i).contains("rule")) {
                playingDeck.add(i, ParsePList.deck.get(i));
//                System.out.println(playingDeck.get(i));
            }
        }
//        System.out.println(playingDeck.get(33));?
        //shuffle the deck
        cloneAndShuffleDeck();
        dealCardsToPlayers();
    }

    private static void cloneAndShuffleDeck() {
        for (String aPlayingDeck : playingDeck) {
            shuffledDeck.add(aPlayingDeck);
        }

        Collections.shuffle(shuffledDeck);
    }

    private static void dealCardsToPlayers() {
        if (playerCount == 3) {

            Players player = new Players("1");
            Players player2 = new Players("2");
            Players player3 = new Players("3");

            System.out.println(player);
            System.out.println(player2);
            System.out.println(player3);

            for (int i = 0; i < playerCount; i++) {

            }
        }

        if (playerCount == 4) {
        }

        if (playerCount == 5) {

        }

    }


    public static void cardClass() {
        Card card1 = new Card(playingDeck.get(0).split("​"));
        Card card2 = new Card(playingDeck.get(1).split("​"));
        Card card3 = new Card(playingDeck.get(2).split("​"));
        Card card4 = new Card(playingDeck.get(3).split("​"));
        Card card5 = new Card(playingDeck.get(4).split("​"));
        Card card6 = new Card(playingDeck.get(5).split("​"));
        Card card7 = new Card(playingDeck.get(6).split("​"));
        Card card8 = new Card(playingDeck.get(7).split("​"));
        Card card9 = new Card(playingDeck.get(8).split("​"));
        Card card10 = new Card(playingDeck.get(9).split("​"));
        Card card11 = new Card(playingDeck.get(10).split("​"));
        Card card12 = new Card(playingDeck.get(11).split("​"));
        Card card13 = new Card(playingDeck.get(12).split("​"));
        Card card14 = new Card(playingDeck.get(13).split("​"));
        Card card15 = new Card(playingDeck.get(14).split("​"));
        Card card16 = new Card(playingDeck.get(15).split("​"));
        Card card17 = new Card(playingDeck.get(16).split("​"));
        Card card18 = new Card(playingDeck.get(17).split("​"));
        Card card19 = new Card(playingDeck.get(18).split("​"));
        Card card20 = new Card(playingDeck.get(19).split("​"));
        Card card21 = new Card(playingDeck.get(20).split("​"));
        Card card22 = new Card(playingDeck.get(21).split("​"));
        Card card23 = new Card(playingDeck.get(22).split("​"));
        Card card24 = new Card(playingDeck.get(23).split("​"));
        Card card25 = new Card(playingDeck.get(24).split("​"));
        Card card26 = new Card(playingDeck.get(25).split("​"));
        Card card27 = new Card(playingDeck.get(26).split("​"));
        Card card28 = new Card(playingDeck.get(27).split("​"));
        Card card29 = new Card(playingDeck.get(28).split("​"));
        Card card30 = new Card(playingDeck.get(29).split("​"));
        Card card31 = new Card(playingDeck.get(30).split("​"));
        Card card32 = new Card(playingDeck.get(31).split("​"));
        Card card33 = new Card(playingDeck.get(32).split("​"));
        Card card34 = new Card(playingDeck.get(33).split("​"));
        Card card35 = new Card(playingDeck.get(34).split("​"));
        Card card36 = new Card(playingDeck.get(35).split("​"));
        Card card37 = new Card(playingDeck.get(36).split("​"));
        Card card38 = new Card(playingDeck.get(37).split("​"));
        Card card39 = new Card(playingDeck.get(38).split("​"));
        Card card40 = new Card(playingDeck.get(39).split("​"));
        Card card41 = new Card(playingDeck.get(40).split("​"));
        Card card42 = new Card(playingDeck.get(41).split("​"));
        Card card43 = new Card(playingDeck.get(42).split("​"));
        Card card44 = new Card(playingDeck.get(43).split("​"));
        Card card45 = new Card(playingDeck.get(44).split("​"));
        Card card46 = new Card(playingDeck.get(45).split("​"));
        Card card47 = new Card(playingDeck.get(46).split("​"));
        Card card48 = new Card(playingDeck.get(47).split("​"));
        Card card49 = new Card(playingDeck.get(48).split("​"));
        Card card50 = new Card(playingDeck.get(49).split("​"));
        Card card51 = new Card(playingDeck.get(50).split("​"));
        Card card52 = new Card(playingDeck.get(51).split("​"));
        Card card53 = new Card(playingDeck.get(52).split("​"));
        Card card54 = new Card(playingDeck.get(53).split("​"));
    }
}