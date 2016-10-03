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

    public static ArrayList<ArrayList<String>> deck = new ArrayList<>();

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
                ArrayList<String> card = new ArrayList<String>();

                card.add(filename.toArray()[i].toString());
                card.add(imagename.toArray()[i].toString());
                card.add(card_type.toArray()[i].toString());
                if (card_type.toArray()[i].toString().equals("play")) {
                    card.add(title.toArray()[i].toString());
                    card.add(chem.toArray()[i].toString());
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
                deck.add(card);
                }
            Card card1 = new Card(deck.get(0));
            System.out.println(card1.toString());
        } catch (
                ParserConfigurationException e) {
            e.printStackTrace();
        }

//        System.out.println(filename);
//        System.out.println(imagename);
//        System.out.println(card_type);
//        System.out.println(title);
//        System.out.println(chem);
//        System.out.println(classification);
//        System.out.println(crystal_system);
//        System.out.println(occurrence);
//        System.out.println(hardness);
//        System.out.println(specificgravity);
//        System.out.println(cleave);
//        System.out.println(crustal_abund);
//        System.out.println(economic_value);
//        System.out.println(deck.toString());
    }
}