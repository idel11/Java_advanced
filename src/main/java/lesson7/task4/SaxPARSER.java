package lesson7.task4;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SaxPARSER {
    public static void main(String[] args) {
        String filename = "src/main/java/lesson7/task3/Address.xml";
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxPARSER = factory.newSAXParser();

            DefaultHandler defaultHandler = new DefaultHandler() {
                boolean name = false;
                boolean street = false;
                boolean home = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("city")) {
                        name = true;
                    }
                    if (qName.equalsIgnoreCase("Street")) {
                        street = true;
                    }
                    if (qName.equalsIgnoreCase("building_number")) {
                        home = true;
                    }

                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (name) {
                        System.out.println("City - " + new String(ch, start, length));
                        name = false;
                    }
                    if (street) {
                        System.out.println("Street - " + new String(ch, start, length));
                        street = false;
                    }
                    if (home) {
                        System.out.println("Home - " + new String(ch, start, length));
                        home = false;
                    }
                }
            };
            saxPARSER.parse(filename, defaultHandler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}

