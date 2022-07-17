package lesson7.task3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JAXBException {

        City kyiv = new City("big","Kyiv");
        City london = new City("big", "Kyiv");

        Address myAddress = new Address(kyiv,"Khreschatyk", 1);
        Address borisAddress = new Address(london,"Downing", 10);

        Addresses listAdr = new Addresses(List.of(myAddress, borisAddress));

        StringWriter writer = new StringWriter();

        JAXBContext context = JAXBContext.newInstance(City.class, Addresses.class, Address.class);


        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(listAdr, new File("src/main/java/lesson7/task3/Address.xml"));

    }
}
