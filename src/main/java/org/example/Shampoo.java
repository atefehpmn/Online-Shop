package org.example;

public class Shampoo extends HealthBeauty{
    String scent;
    String hair;

    public void setScent(String scent) {
        this.scent = scent;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public Shampoo() {}

    @Override
    public String toString() {
        return super.toString() + " Shampoo{" +
                "scent='" + scent + '\'' +
                ", hair='" + hair + '\'' +
                ", brand='" + brand + '\'' +
                "} ";
    }
}
