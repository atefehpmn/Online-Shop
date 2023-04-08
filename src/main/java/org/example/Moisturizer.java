package org.example;

public class Moisturizer extends HealthBeauty{
    String skin;
    public Moisturizer(){}

    @Override
    public String toString() {
        return  super.toString() + " Moisturizer{" +
                "skin='" + skin + '\'' +
                ", brand='" + brand + '\'' +
                "}";
    }
}
