package org.example;

public class Perfume extends HealthBeauty{
    private String scent;
    private String gender;

    public void setScent(String scent) {
        this.scent = scent;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return super.toString() + "Perfume{" +
                "scent='" + scent + '\'' +
                ", gender='" + gender + '\'' +
                ", brand='" + brand + '\'' +
                "}";
    }
}
