package sda.com.ShippingInformation;

import java.util.Scanner;

public class ShippingData {
    private String name;
    private String lastName;
    private String street;
    private String city;


    public ShippingData() {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("podaj imie");
            this.name = in.nextLine();
            System.out.println("podaj nazwzko");
            this.lastName = in.nextLine();
            System.out.println("podaj ulice");
            this.street = in.nextLine();
            System.out.println("podaj miasto");
            this.city = in.nextLine();
        }
    }

    public ShippingData(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
