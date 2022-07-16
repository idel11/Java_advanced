package lesson7.task3_2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class London extends City {

    @XmlAttribute(name = "size")
    private String size;

    @XmlElement(name = "street")
    List<Street> streets = new ArrayList<>();

    public London(List<Street> streets, String size) {
        this.streets = streets;
        this.size = size;
    }

    public London() {
    }
}
