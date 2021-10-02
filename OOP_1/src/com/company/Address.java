package com.company;

public class Address {
    private int index, house, apartments;
    private String country, city, street;

    public void showAddress(){
        System.out.println("Индекс: " + index);
        System.out.println("Страна: " + country);
        System.out.println("Город: " + city);
        System.out.println("Улица: " + street);
        System.out.println("Дом :" + house);
        System.out.printf("Квартира: " + apartments);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
