package com.abhinav.models;

import com.abhinav.enums.VehicleType;

public class Vehicle {
    private VehicleType type;
    private String number;

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
