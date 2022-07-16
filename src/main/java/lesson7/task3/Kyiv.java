package lesson7.task3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Kyiv")
@XmlRootElement
public class Kyiv {

    @XmlAttribute(name = "size")
    private String size;
    @XmlElement(name = "street")
    private String street;
    @XmlElement(name = "number")
    private int number;


    public Kyiv(String size, String street, int number) {
        this.size = size;
        this.street = street;
        this.number = number;
    }

    public Kyiv() {
    }
}
