package org.example;

public class Bag extends Clothing{
    private String style;

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "style='" + style + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                "}";
    }
}
