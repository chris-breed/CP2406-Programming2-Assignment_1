import jdk.internal.org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class SuperTrumpGame {

    public static int playerCount;
    public ArrayList<Integer> players = new ArrayList<Integer>(3);

    public static void main(String[] args) throws SAXException, ParserConfigurationException, org.xml.sax.SAXException, ParseException, IOException {

        /*if start -
        ask user how many players there are (1 user player, between 3 and 4 bots)
        start game
        randomly select dealer
        randomly distribute the cards*/
        boolean running = false;

        //initialised deck
        try {
            ParsePList.main(args);
            System.out.println("debug - deck initialised");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }


        initializeGame();


    }

    private static void initializeGame() {
        checkPlayerCount();
        selectDealer();
        //deal out cards from the deck class

    }

    private static int selectDealer() {
        return new Random().nextInt(playerCount);
    }


    private static int checkPlayerCount() {
        playerCount = getPlayerCount();

        while (playerCount < 3 && playerCount < 5) {

            System.out.println("\n\n\n\n\n\nEnter a number of players between 3 and 5 (including the player)");
            playerCount = getPlayerCount();
        }
        String playersArray[] = new String[playerCount];

        return playerCount;
    }

    private static int getPlayerCount() {
        int noPlayers;
        Scanner menuSelection = new Scanner(System.in);
        System.out.println("How many players are there? (Between 3 and 5)");
        noPlayers = menuSelection.nextInt();

        return noPlayers;
    }
}
