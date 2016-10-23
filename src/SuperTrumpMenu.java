import jdk.internal.org.xml.sax.SAXException;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;


public class SuperTrumpMenu extends JFrame {
    /*
    start game
    show menu (start, instructions, exit)

     */

    private SuperTrumpMenu() {
        super("SuperTrump");
        setSize(500, 250);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout((new FlowLayout()));


        JPanel startOptions = new JPanel(new GridBagLayout());

        SpinnerNumberModel noPlayersLimit = new SpinnerNumberModel(3.0, 3.0, 5.0, 1.0);
        JSpinner noPlayers = new JSpinner(noPlayersLimit);

        JButton startGameButton = new JButton("Start Game");
        JButton instructionsButton = new JButton("Instructions");

        JLabel enterPlayers = new JLabel("How many players?");
        JLabel instructionsLabel = new JLabel("Read the instructions!");

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.NORTHWEST;
        startOptions.add(enterPlayers, c);
        c.gridy = 1;
        startOptions.add(noPlayers, c);
        c.gridy = 2;
        startOptions.add(startGameButton, c);


        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.NORTHEAST;
        startOptions.add(instructionsLabel, c);
        c.gridy = 1;
        startOptions.add(instructionsButton, c);
        add(startOptions);

    }

    public static void main(String[] args) throws SAXException, ParserConfigurationException, org.xml.sax.SAXException, ParseException, IOException {
        //show menu
        new SuperTrumpMenu().setVisible(true);

    }
//        String menuInputString;
//        int menuSelection = 0;
//        String writtenInstructions = "Put some instructions here";
//
//        Scanner menuScanner = new Scanner(System.in);
//
//        System.out.println(showMenuMessage());
//        menuInputString = menuScanner.nextLine();
//
////        System.out.println(menuInputString);
//
//        switch (menuInputString.toLowerCase()) {
//            case "start":
//                menuSelection = 1;
//                break;
//            case "instructions":
//                menuSelection = 2;
//                break;
//            case "quit":
//                menuSelection = 3;
//                break;
//        }
//
//
//        if (menuSelection == 1 || Integer.parseInt(menuInputString) == 1) {
//            SuperTrumpGame.main(args);
//        } else if (menuSelection == 2 || Integer.parseInt(menuInputString) == 2) {
//            System.out.println("\n\n\n\n\n\n\n");
//            System.out.println(writtenInstructions);
//            sleepForTime(1500);
//            System.out.println("\n\n\n\n\n\n\n");
//            System.out.println(showMenuMessage());
//        } else if (menuSelection == 3 || Integer.parseInt(menuInputString) == 3) {
//            //TODO: exit program
//        }
//
//
//    }
//
//    private static String showMenuMessage() {
//        return "Welcome to the Super Trump Mineral card game!\nPlease select an option:\n\t1. Start\n\t2. Instructions\n\t3. Quit";
//    }
//
//    private static void sleepForTime(int time) {
//        try {
//            Thread.sleep(time);
//        } catch (InterruptedException e) {
//            System.out.println("got interrupted!");
//        }

    }
