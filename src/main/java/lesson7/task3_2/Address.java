package lesson7.task3_2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "address")
@XmlRootElement
public class Address {
    @XmlElement(name = "city")
    List<City> cities = new ArrayList<>();

    public Address(List<City> cities) {
        this.cities = cities;
    }

    public Address() {
    }
}
