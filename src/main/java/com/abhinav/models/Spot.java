package com.abhinav.models;

import com.abhinav.enums.SpotStatus;
import com.abhinav.enums.VehicleType;

import java.util.List;

public class Spot {
    private Floor floor;
    private Integer position;
    private SpotStatus availability;
    private List<VehicleType> supportVehicles;

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public SpotStatus getAvailability() {
        return availability;
    }

    public void setAvailability(SpotStatus availability) {
        this.availability = availability;
    }

    public List<VehicleType> getSupportVehicles() {
        return supportVehicles;
    }

    public void setSupportVehicles(List<VehicleType> supportVehicles) {
        this.supportVehicles = supportVehicles;
    }
}
