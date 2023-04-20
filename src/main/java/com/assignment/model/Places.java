package com.assignment.model;

//"place name": "Miami", "longitude": "-80.183", "state": "Florida", 
//"state abbreviation": "FL", "latitude": "25.9286"}]}
public class Places {

    private String place_name;
    private String longitude;
    private String state;
    private String statte_abbreviation;
    private String latitude;

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatte_abbreviation() {
        return statte_abbreviation;
    }

    public void setStatte_abbreviation(String statte_abbreviation) {
        this.statte_abbreviation = statte_abbreviation;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

}
