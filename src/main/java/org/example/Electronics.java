package org.example;

public class Electronics extends Product{
    String brand;
    String color;
    String CPU;
    String screenResolution;
    int RAM;
    double sizeInInch;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setSizeInInch(double sizeInInch) {
        this.sizeInInch = sizeInInch;
    }
}
