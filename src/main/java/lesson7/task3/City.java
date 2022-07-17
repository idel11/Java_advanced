package lesson7.task3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "city")
public class City {

    String size;

    String city;

    public City(String size, String city) {
        this.size = size;
        this.city = city;
    }

    public City() {
    }

    public String getSize() {
        return size;
    }

    @XmlAttribute(name = "size")
    public void setSize(String size) {
        this.size = size;
    }

    public String getCity() {
        return city;
    }

    @XmlValue
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "size='" + size + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

