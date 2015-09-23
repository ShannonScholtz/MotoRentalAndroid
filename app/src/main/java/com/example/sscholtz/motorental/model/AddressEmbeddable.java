package com.example.sscholtz.motorental.model;

/**
 * Created by sscholtz on 2015/09/23.
 */
public class AddressEmbeddable {
    private String Address;
    private String City;
    private String postalCode;


    public AddressEmbeddable(String Address, String City, String postalCode) {
        this.Address = Address;
        this.City = City;
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
