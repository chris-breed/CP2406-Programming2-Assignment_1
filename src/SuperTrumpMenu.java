import jdk.internal.org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;

public class SuperTrumpMenu extends JFrame {
    /*
    start game
    show menu (start, instructions, exit)

     */

    private SuperTrumpMenu() {
        //menu frame
        super("SuperTrump - Menu");
        setSize(500, 250);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //menu panels
        JPanel startOptions = new JPanel(new GridBagLayout());

        //spinner for selecting how many players with limiter and default value
        SpinnerNumberModel noPlayersSpinner = new SpinnerNumberModel(3, 3, 5, 1);
        JSpinner noPlayers = new JSpinner(noPlayersSpinner);

        //buttons for the main menu
        JButton startGameButton = new JButton("Start Game");

        //labels for the menu
        JLabel enterPlayers = new JLabel("How many players?");
        JLabel instructionsLabel1 = new JLabel("Instructions:");
        JLabel instructionsLabel2 = new JLabel("Select a card that trumps the previously played card");

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.NORTHWEST;
        startOptions.add(enterPlayers, c);
        c.gridy = 1;
        startOptions.add(noPlayers, c);
        c.gridy = 2;
        startOptions.add(startGameButton, c);

        //event for start button click
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println((Integer) noPlayersSpinner.getValue());
                try {
                    SuperTrumpGame.main((Integer) noPlayersSpinner.getValue());
                    setVisible(false);
                } catch (SAXException | ParserConfigurationException | org.xml.sax.SAXException | IOException | ParseException e1) {
                    e1.printStackTrace();
                }
            }
        });

        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.NORTHEAST;
        startOptions.add(instructionsLabel1, c);
        c.gridy = 1;
        startOptions.add(instructionsLabel2, c);
        add(startOptions);

    }

    public static void main(String[] args) throws SAXException, ParserConfigurationException, org.xml.sax.SAXException, ParseException, IOException {
        //show menu
        new SuperTrumpMenu().setVisible(true);

    }
}
