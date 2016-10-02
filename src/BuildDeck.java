import com.dd.plist.*;

import java.io.File;

public class BuildDeck {

    private static File fileInput = new File("/MstCards_151021.plist");

    public static void main(String[] args) {
        String[][] buildDeck = new String[60][13]; //60 cards, 13 values for each card
        buildDeck = getDeck();

        for (int i = 0; i <= buildDeck.length; i++) {
            System.out.println(buildDeck[0][i]);
        }

        for (int o = 0; o <= buildDeck.length; o++) {
            System.out.println(buildDeck[1][o]);
        }
    }

    private static String[][] getDeck() {
        String[][] deck = new String[60][13];

        for (int i = 0; i <= 1; i++) {
            deck[1] = buildCard(1);
        }
        return deck;
    }

    private static String[] buildCard(int i) {
        String[] cards = new String[13];

        String fileName;
        String imageName;
        String cardType;
        String title;
        String chemistry;
        String classification;
        String crystalSystem;
        String[] occurance; //3 options: igneous, metamorphic and sedimentary
        int hardness;   //1 to 10 scale
        float specifcGravity;   //grams per cubic cm
        String cleavage;    //eg (1 perfect, 2 poor) means the mineral has 1 perfect plane and 2 poor planes
        String crustalAbundance;    //lowest to highest: ultratrace, trace, low, moderate, high, very high
        String economicValue;   //lowest to highest: trivial, low, moderate, high, very high, I'm rich!

        System.out.println(fileInput);

//        NSDictionary d = null;
//        try {
//            d = (NSDictionary) PropertyListParser.parse(raw.getBytes("UTf-8"));
//        } catch (Exception e) {
//            //ignore.
//        }
//        uuid = ((NSString) d.get("UUID")).getContent();
//        name = ((NSString) d.get("Name")).getContent();
//        appId = ((NSString) d.get("AppIDName")).getContent();
//        teamName = ((NSString) d.get("TeamName")).getContent();
//        creationDate = ((NSDate) d.get("CreationDate")).getDate();
//        expirationDate = ((NSDate) d.get("ExpirationDate")).getDate();


        return cards;
    }

//    public static NSO parse(File  fileInput)
//            throws ParserConfigurationException,
//            ParseException,
//            SAXException,
//            PropertyListFormatException,
//            IOException{
//
//    }
}
