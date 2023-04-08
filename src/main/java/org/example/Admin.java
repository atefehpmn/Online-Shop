package org.example;

public class Admin extends Account{
    private String email;
    public Admin(){};
    public Admin(String name, String password, String email) {
        super(name, password);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + " Admin{" +
                "email='" + email + '\'' +
                "}";
    }
}
