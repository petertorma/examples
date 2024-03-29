package xyz.codingmentor.beanvalidation;

import xyz.codingmentor.beanvalidation.constraint.ZipCode;
import java.util.Collection;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author developer
 */
public class Address {

    @NotNull
    private String street1;
    private String street2;
    @NotNull
    private String city;
    @Size
    private String state;
    @NotNull
    @ZipCode
    private String zipcode;
    @Size
    private Collection<?> alma;

    public Address(String street1, String city, String zipcode) {
        this.street1 = street1;
        this.city = city;
        this.zipcode = zipcode;
    }
    private String country;

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
