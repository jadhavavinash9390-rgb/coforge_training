package Assignment_day_3;

public class MobilePhone {

    private String brand;
    private String model;
    private int ram;
    private double price;

    public MobilePhone(String brand, String model, int ram, double price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {

        return "Brand = " + brand +
               "\nModel = " + model +
               "\nRAM = " + ram +
               "\nPrice = " + price;
    }
}