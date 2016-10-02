import com.dd.plist.*;
import jdk.internal.org.xml.sax.SAXException;


import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;


public class ParsePList {
    public static void main(String[] args) throws SAXException, ParseException, IOException, PropertyListFormatException, org.xml.sax.SAXException, ParserConfigurationException {
        String file = "MstCards_151021.plist";

        NSDictionary cards = (NSDictionary) PropertyListParser.parse(file);
        String fileName = ((NSString) cards.objectForKey("fileName")).toString();

        System.out.println(fileName);

    }

}



