package lesson7.task3_2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException {

        Street downing = new Downing(10);
        Street khreschatyk = new Khreschatyk(1);
        City london = new London(List.of(downing), "big");
        City kyiv = new Kyiv(List.of(khreschatyk), "big");
        Address addresses = new Address(List.of(kyiv, london));


        StringWriter writer = new StringWriter();

        JAXBContext context = JAXBContext.newInstance(Address.class,
                City.class,
                Street.class,
                Kyiv.class,
                London.class,
                Khreschatyk.class, Downing.class);


        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(addresses, new File("src/main/java/lesson7/task3_2/Address.xml"));

    }
}
