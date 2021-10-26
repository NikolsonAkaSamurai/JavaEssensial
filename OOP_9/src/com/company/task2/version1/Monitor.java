package com.company.task2.version1;

public class Monitor extends Device{

    //поля
    private int resolutionX;
    private int resolutionY;
    private int ethernetAdapter;
    private String mac;

    //конструкторы
    Monitor(){}

    public Monitor(Device device, int resolutionX, int resolutionY, int ethernetAdapter, String mac) {
        manufacturer = device.manufacturer;
        price = device.price;
        serialNumber = device.serialNumber;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.ethernetAdapter = ethernetAdapter;
        this.mac = mac;
    }

    //гетеры и сетеры
    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getEthernetAdapter() {
        return ethernetAdapter;
    }

    public void setEthernetAdapter(int ethernetAdapter) {
        this.ethernetAdapter = ethernetAdapter;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    //переопределенные методы Object
    @Override
    public String toString() {
        return "Monitor: "+manufacturer+", price = "+price+", serial number = "+serialNumber+ ", X = "+resolutionX+", Y = "+resolutionY;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Monitor m2 = (Monitor) obj;
        return (manufacturer.equals(m2.getManufacturer()) &&
                price == m2.getPrice() &&
                serialNumber.equals(m2.getSerialNumber()) &&
                resolutionX == m2.getResolutionX() &&
                resolutionY == m2.resolutionY &&
                ethernetAdapter == m2.ethernetAdapter &&
                mac.equals(m2.getMac()))? true : false;
    }

    //копирование монитора
    public static Monitor copyMonitor(Monitor oldMonitor){
        Device d = new Device(oldMonitor.getManufacturer(), oldMonitor.getPrice(), oldMonitor.getSerialNumber());
        Monitor copiedMonitor = new Monitor(d,oldMonitor.getResolutionX(),oldMonitor.getResolutionY(),
                oldMonitor.getEthernetAdapter(),oldMonitor.getMac());
        return copiedMonitor;
    }
}
