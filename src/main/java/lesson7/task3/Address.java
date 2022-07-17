package lesson7.task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "address")
public class Address {

    City city;

    String street;

    int number;

    public Address(City city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public Address() {
    }

    public City getCity() {
        return city;
    }

    @XmlElement(name = "city")
    public void setCity(City city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    @XmlElement(name = "street")
    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    @XmlElement(name = "building_number")
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address1{" +
                "city=" + city +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
