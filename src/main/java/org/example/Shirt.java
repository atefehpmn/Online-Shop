package org.example;

public class Shirt extends Clothing{
    private int size;
    private String kind;

    public void setSize(int size) {
        this.size = size;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size=" + size +
                ", kind='" + kind + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                "} " + super.toString();
    }
}
