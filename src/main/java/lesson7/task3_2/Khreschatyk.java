package lesson7.task3_2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Khreschatyk extends Street {

    @XmlElement(name = "house_number")
    private int houseNumber;


    public Khreschatyk(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Khreschatyk() {
    }
}
