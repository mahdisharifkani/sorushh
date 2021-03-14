package com.example.demo.Driver;

import java.time.LocalDate;
import java.util.Locale;

public class Driver {
    private Long id;
    private String name;
    private String plate;
    private String model;
    private String phoneNumber;
    private LocalDate dob;

    public Driver() {
    }

    public Driver(Long id,
                  String name,
                  String plate,
                  String model,
                  String phoneNumber,
                  LocalDate dob) {
        this.id = id;
        this.name = name;
        this.plate = plate;
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public Driver(String name,
                  String plate,
                  String model,
                  String phoneNumber,
                  LocalDate dob) {
        this.name = name;
        this.plate = plate;
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }



    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plate='" + plate + '\'' +
                ", model='" + model + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dob=" + dob +
                '}';
    }
}
