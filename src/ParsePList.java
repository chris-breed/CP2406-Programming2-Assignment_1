import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class ParsePList {

    private static ArrayList<String> filename = new ArrayList<>();
    private static ArrayList<String> imagename = new ArrayList<>();
    private static ArrayList<String> card_type = new ArrayList<>();
    private static ArrayList<String> title = new ArrayList<>();
    private static ArrayList<String> chem = new ArrayList<>();
    private static ArrayList<String> classification = new ArrayList<>();
    private static ArrayList<String> crystal_system = new ArrayList<>();
    private static ArrayList<String> occurrence = new ArrayList<>();
    private static ArrayList<String> hardness = new ArrayList<>();
    private static ArrayList<String> specificgravity = new ArrayList<>();
    private static ArrayList<String> cleave = new ArrayList<>();
    private static ArrayList<String> crustal_abund = new ArrayList<>();
    private static ArrayList<String> economic_value = new ArrayList<>();
    private static ArrayList<String> subtitles = new ArrayList<>();

    public static ArrayList<String> deck = new ArrayList();

    public static void main(String[] args) throws SAXException, ParseException, IOException, org.xml.sax.SAXException, ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("MstCards_151021.plist");

            NodeList cardList = doc.getElementsByTagName("array");

            for (int i = 0; i < cardList.getLength(); i++) {
                Node p = cardList.item(i);
                if (p.getNodeType() == Node.ELEMENT_NODE) {
                    Element card = (Element) p;
                    NodeList cardsList = card.getChildNodes();

                    for (int j = 0; j < cardsList.getLength(); j++) {
                        Node q = cardsList.item(j);
                        if (q.getNodeType() == Node.ELEMENT_NODE) {
                            Element cardName = (Element) q;
                            NodeList keys2 = cardName.getChildNodes();

                            for (int n = 0; n < keys2.getLength(); n++) {
                                Node r = keys2.item(n);
                                if (!(r.getNodeName().equals("#text"))) {
                                    switch (r.getTextContent()) {
                                        case "fileName":
                                            r = keys2.item(n + 2);
                                            filename.add(r.getTextContent());
                                            break;
                                        case "imageName":
                                            r = keys2.item(n + 2);
                                            imagename.add(r.getTextContent());
                                            break;
                                        case "card_type":
                                            r = keys2.item(n + 2);
                                            card_type.add(r.getTextContent());
                                            break;
                                        case "title":
                                            r = keys2.item(n + 2);
                                            title.add(r.getTextContent());
                                            break;
                                        case "chemistry":
                                            r = keys2.item(n + 2);
                                            chem.add(r.getTextContent());
                                            break;
                                        case "classification":
                                            r = keys2.item(n + 2);
                                            classification.add(r.getTextContent());
                                            break;
                                        case "crystal_system":
                                            r = keys2.item(n + 2);
                                            crystal_system.add(r.getTextContent());
                                            break;
                                        case "occurrence":
                                            r = keys2.item(n + 2);
                                            occurrence.add(r.getTextContent());
                                            break;
                                        case "hardness":
                                            r = keys2.item(n + 2);
                                            hardness.add(r.getTextContent());
                                            break;
                                        case "specific_gravity":
                                            r = keys2.item(n + 2);
                                            specificgravity.add(r.getTextContent());
                                            break;
                                        case "cleavage":
                                            r = keys2.item(n + 2);
                                            cleave.add(r.getTextContent());
                                            break;
                                        case "crustal_abundance":
                                            r = keys2.item(n + 2);
                                            crustal_abund.add(r.getTextContent());
                                            break;
                                        case "economic_value":
                                            r = keys2.item(n + 2);
                                            economic_value.add(r.getTextContent());
                                            break;
                                        case "subtitle":
                                            r = keys2.item(n + 2);
                                            subtitles.add(r.getTextContent());
                                            break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int subTitle = 0;
            for (int i = 0; i < filename.size() - 1; i++) {
                ArrayList card = new ArrayList();

                card.add(filename.toArray()[i].toString());
                card.add(imagename.toArray()[i].toString());
                card.add(card_type.toArray()[i].toString());
                if (card_type.toArray()[i].toString().equals("play")) {
                    card.add(title.toArray()[i].toString());
                    card.add((chem.toArray()[i].toString().replaceAll(",", ".")));
                    card.add(classification.toArray()[i].toString());
                    card.add(crystal_system.toArray()[i].toString());
                    card.add(occurrence.toArray()[i].toString());
                    card.add(hardness.toArray()[i].toString());
                    card.add(specificgravity.toArray()[i].toString());
                    card.add(cleave.toArray()[i].toString());
                    card.add(crustal_abund.toArray()[i].toString());
                    card.add(economic_value.toArray()[i].toString());
                } else if ((card_type.toArray()[i].toString().equals("trump") | (card_type.toArray()[i].toString().equals("rule")))) {
                    card.add(title.toArray()[i].toString());
                    card.add(subtitles.toArray()[subTitle].toString());
                    subTitle++;
                } else {
                    System.out.println("no card type");
                }
                System.out.println("Card: " + card);
                deck.add(card.toString().replaceAll(",", "\u200B"));
            }
            System.out.println("Finished parsing plist file\n=================================");

            System.out.println(deck.get(21));
            Card card1 = new Card(deck.get(0).split("​"));
            Card card2 = new Card(deck.get(1).split("​"));
            Card card3 = new Card(deck.get(2).split("​"));
            Card card4 = new Card(deck.get(3).split("​"));
            Card card5 = new Card(deck.get(4).split("​"));
            Card card6 = new Card(deck.get(5).split("​"));
            Card card7 = new Card(deck.get(6).split("​"));
            Card card8 = new Card(deck.get(7).split("​"));
            Card card9 = new Card(deck.get(8).split("​"));
            Card card10 = new Card(deck.get(9).split("​"));
            Card card11 = new Card(deck.get(10).split("​"));
            Card card12 = new Card(deck.get(11).split("​"));
            Card card13 = new Card(deck.get(12).split("​"));
            Card card14 = new Card(deck.get(13).split("​"));
            Card card15 = new Card(deck.get(14).split("​"));
            Card card16 = new Card(deck.get(15).split("​"));
            Card card17 = new Card(deck.get(16).split("​"));
            Card card18 = new Card(deck.get(17).split("​"));
            Card card19 = new Card(deck.get(18).split("​"));
            Card card20 = new Card(deck.get(19).split("​"));
            Card card21 = new Card(deck.get(20).split("​"));
            Card card22 = new Card(deck.get(21).split("​"));
            Card card23 = new Card(deck.get(22).split("​"));
            Card card24 = new Card(deck.get(23).split("​"));
            Card card25 = new Card(deck.get(24).split("​"));
            Card card26 = new Card(deck.get(25).split("​"));
            Card card27 = new Card(deck.get(26).split("​"));
            Card card28 = new Card(deck.get(27).split("​"));
            Card card29 = new Card(deck.get(28).split("​"));
            Card card30 = new Card(deck.get(29).split("​"));
            Card card31 = new Card(deck.get(30).split("​"));
            Card card32 = new Card(deck.get(31).split("​"));
            Card card33 = new Card(deck.get(32).split("​"));
            Card card34 = new Card(deck.get(33).split("​"));
            Card card35 = new Card(deck.get(34).split("​"));
            Card card36 = new Card(deck.get(35).split("​"));
            Card card37 = new Card(deck.get(36).split("​"));
            Card card38 = new Card(deck.get(37).split("​"));
            Card card39 = new Card(deck.get(38).split("​"));
            Card card40 = new Card(deck.get(39).split("​"));
            Card card41 = new Card(deck.get(40).split("​"));
            Card card42 = new Card(deck.get(41).split("​"));
            Card card43 = new Card(deck.get(42).split("​"));
            Card card44 = new Card(deck.get(43).split("​"));
            Card card45 = new Card(deck.get(44).split("​"));
            Card card46 = new Card(deck.get(45).split("​"));
            Card card47 = new Card(deck.get(46).split("​"));
            Card card48 = new Card(deck.get(47).split("​"));
            Card card49 = new Card(deck.get(48).split("​"));
            Card card50 = new Card(deck.get(49).split("​"));
            Card card51 = new Card(deck.get(50).split("​"));
            Card card52 = new Card(deck.get(51).split("​"));
            Card card53 = new Card(deck.get(52).split("​"));
            Card card54 = new Card(deck.get(53).split("​"));

            System.out.println(card22.title);
            System.out.println(card22.cleavage);
            System.out.println((card22.chemistry).replace(".", ","));
            System.out.println(card22.imageName);

        } catch (
                ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}