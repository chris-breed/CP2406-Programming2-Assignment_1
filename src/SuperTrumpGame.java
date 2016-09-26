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


                //array for the players
                //array for the cards - then reference the deck array
            }
        }

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
