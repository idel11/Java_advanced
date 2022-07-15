package lesson7.task3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) throws JAXBException {

        Kyiv test = new Kyiv("big", "Khreschatyk", 1);

        StringWriter writer = new StringWriter();

        JAXBContext context = JAXBContext.newInstance(Kyiv.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(test, new File("src/main/java/lesson7/task3/Address.xml"));

    }
}
