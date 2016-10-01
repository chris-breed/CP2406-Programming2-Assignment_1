import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class SuperTrumpGame {

    public int playerCount;
    public ArrayList<Integer> players = new ArrayList<Integer>(3);

    public static void main(String[] args) {

        /*if start -
        ask user how many players there are (1 user player, between 3 and 4 bots)
        start game
        randomly select dealer
        randomly distribute the cards*/
        boolean running = false;

        initializeGame();


    }

    private static void initializeGame(){
        checkPlayerCount();
        selectDealer();

    }

    private static int selectDealer() {
        int dealerPosition = 0;


        return dealerPosition;
    }


    private static int checkPlayerCount() {
        boolean playersCountBool = false;
        int playerCount;

        playerCount = getPlayerCount();

        while (!playersCountBool) {
            if (!(playerCount <= 5 && playerCount >= 3)) {
                System.out.println("\n\n\n\n\n\nEnter a number of players between 3 and 5 (including the player)");
                playerCount = getPlayerCount();
            } else {
                playersCountBool = true;

                //create an array for the players
                ArrayList<ArrayList> playersArray = new ArrayList<ArrayList>(playerCount);

                //creates an arraylist within the playersArrayList for the cards that the players have
                //references a number

                for (int i = 0; i <= playerCount; i++){
                    playersArray.add(new ArrayList<Integer>());
                }


                //initialise cards into each of the users hands
                //each player starts with 8 cards
                //call BuildDeck() (gets 8 cards)
                buildDeck();

                //array for the players
                //array for the cards - then reference the deck array
            }
        }

        return playerCount;
    }

    private static int[] buildDeck() {
        int deck[] = new int[8];

        //call getCards() method (gets a random card from the deck and removes it as a possible card
        getCards();


        return deck;
    }

    private static int getCards() {
        int card;

        card = 0;


        return card;
    }

    private static int getPlayerCount() {
        int noPlayers;
        Scanner menuSelection = new Scanner(System.in);
        System.out.println("How many players are there? (Between 3 and 5)");
        noPlayers = menuSelection.nextInt();

        return noPlayers;
    }
}
