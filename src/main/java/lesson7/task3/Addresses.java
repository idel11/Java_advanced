package lesson7.task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "addresses")
@XmlRootElement
public class Addresses {

    @XmlElement(name = "address")
    List<Address> adderesses = new ArrayList<>();

    public Addresses(List<Address> adderesses) {
        this.adderesses = adderesses;
    }

    public Addresses() {
    }
}
