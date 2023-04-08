package org.example;

public class Shoes extends Clothing{
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                "}";
    }
}
