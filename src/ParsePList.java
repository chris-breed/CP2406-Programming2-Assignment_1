import com.dd.plist.NSDictionary;
import com.dd.plist.NSObject;
import com.dd.plist.PropertyListFormatException;
import com.dd.plist.XMLPropertyListParser;
import jdk.internal.org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;


public class ParsePList {
    public static void main(String[] args) throws SAXException, ParseException, IOException, PropertyListFormatException, org.xml.sax.SAXException, ParserConfigurationException {
        File file = new File("MstCards_151021.plist");


        NSDictionary keys = (NSDictionary) XMLPropertyListParser.parse(file);
        String list[] = keys.allKeys();

        for (int i = 0; i < keys.size(); i++) {
            System.out.println(list[i]);

        }

        NSObject list2 = keys.objectForKey("title");
        System.out.println(list2);

        System.out.println(keys.containsKey("cards"));
        System.out.println(keys.containsKey("title"));
    }

}



