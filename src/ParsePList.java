import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;


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

//    public static ArrayList<Object> deck = new ArrayList<>();


    public static void main(String[] args) throws SAXException, ParseException, IOException, org.xml.sax.SAXException, ParserConfigurationException {
        String[][] deck = new String[50][12];

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("MstCards_151021.plist");

            NodeList cardList = doc.getElementsByTagName("array");
//            System.out.println("there are " + cardList.getLength());

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
//                            System.out.println(cardName.getTextContent());

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
                                    }
                                }
                            }
                        }
                    }
                }

            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.xml.sax.SAXException e) {
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

        for (int i = 0; i < 54; i++) {
            deck[i][i] = constructedCard(i);
        }

        System.out.println(String.valueOf(deck[4]));


    }

    private static String[] constructedCard(int i) {
        String[] completeCard = new String[13];

        completeCard[0] = filename.get(i);
        completeCard[1] = imagename.get(i);
        completeCard[2] = card_type.get(i);
        completeCard[3] = title.get(i);
        completeCard[4] = chem.get(i);
        completeCard[5] = classification.get(i);
        completeCard[6] = crystal_system.get(i);
        completeCard[7] = occurrence.get(i);
        completeCard[8] = hardness.get(i);
        completeCard[9] = specificgravity.get(i);
        completeCard[10] = cleave.get(i);
        completeCard[11] = crustal_abund.get(i);
        completeCard[12] = economic_value.get(i);

        return completeCard;
    }
}




