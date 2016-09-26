import java.util.Scanner;

public class SuperTrumpMenu {
    /*
    start game
    show menu (start, instructions, exit)

     */

    public static void main(String[] args) {
        //show menu
        String menuInputString;
        int menuSelection = 0;
        String writtenInstructions = "Put some instructions here";

        Scanner menuScanner = new Scanner(System.in);

        System.out.println(showMenuMessage());
        menuInputString = menuScanner.nextLine();

//        System.out.println(menuInputString);

        switch (menuInputString.toLowerCase()) {
            case "start":
                menuSelection = 1;
                break;
            case "instructions":
                menuSelection = 2;
                break;
            case "quit":
                menuSelection = 3;
                break;
        }


        if (menuSelection == 1 || Integer.parseInt(menuInputString) == 1) {
            SuperTrumpGame.main(args);
        } else if (menuSelection == 2 || Integer.parseInt(menuInputString) == 2) {
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println(writtenInstructions);
            sleepForTime(1500);
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println(showMenuMessage());
        } else if (menuSelection == 3 || Integer.parseInt(menuInputString) == 3) {
            //TODO: exit program
        }


    }

    private static String showMenuMessage() {
        return "Welcome to the Super Trump Mineral card game!\n Please select an option: \n \t1. Start\n \t2. Instructions\n \t3. Quit";
    }

    private static void sleepForTime(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
}
