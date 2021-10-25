package com.company.task2.version2;

public class Device {
    private String manufacturer, serialNumber;
    private int price;

    public Device(){};

    public Device(String manufacturer, int price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device: manufacturer = "+manufacturer+", price = "+price+", serial number = "+serialNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object d) {
        Device d2 = (Device) d;
        return (manufacturer.equals(d2.manufacturer) && price == d2.price && serialNumber.equals(d2.serialNumber))?
                true:false;
    }

    public static Device copyDevice(Device d1){
        Device d2 = new Device(d1.manufacturer,d1.price,d1.serialNumber);
        return d2;
    }

    //--------------------монитор девайса-------------------
    class Monitor{
        private int resolutionX, resolutionY, ethernetAdapter;
        private String mac;

        Monitor(){};

        public Monitor(int resolutionX, int resolutionY, int ethernetAdapter, String mac) {
            this.resolutionX = resolutionX;
            this.resolutionY = resolutionY;
            this.ethernetAdapter = ethernetAdapter;
            this.mac = mac;
        }

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

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object m) {
            Monitor m2 = (Monitor) m;
            return true;
        }

        @Override
        public String toString() {
            return "Monitor: manufacturer = "+manufacturer+", price = "+price+", serial number = "+serialNumber+
                    ", X = "+resolutionX+", Y = "+resolutionY;
        }
    }
}
