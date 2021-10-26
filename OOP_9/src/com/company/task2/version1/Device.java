package com.company.task2.version1;

public class Device {
    //поля
    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    //конструкторы
    public Device(){};

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    //гетеры и сетеры
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //переопределенные методы Object
    @Override
    public String toString() {
        return "Device: "+manufacturer+", price = "+price+", serial number = "+serialNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 17;

        result = prime * result + (manufacturer == null ? 0 : manufacturer.hashCode());
        result = prime * result + Float.floatToIntBits(price);
        result = prime * result + (serialNumber == null ? 0 : serialNumber.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Device d2 = (Device) obj;
        return (manufacturer.equals(d2.getManufacturer()) && price == d2.getPrice() && serialNumber.equals(d2.getSerialNumber()))?
                true:false;
    }

    //метод для копирования девайса
    public static Device copyDevice(Device oldDevice){
        Device copiedDevice = new Device(oldDevice.getManufacturer(),oldDevice.getPrice(),oldDevice.getSerialNumber());
        return copiedDevice;
    }
}
