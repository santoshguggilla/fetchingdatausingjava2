package com.assignment.model;

public class Data {

    private int postcode;
    private String country;
    private String country_abbreviation;
    private Places[] places;

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_abbreviation() {
        return country_abbreviation;
    }

    public void setCountry_abbreviation(String country_abbreviation) {
        this.country_abbreviation = country_abbreviation;
    }

    public Places[] getPlaces() {
        return places;
    }

    public void setPlaces(Places[] places) {
        this.places = places;
    }

}