/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testpaper2024;

/**
 *
 * @author lab_services_student
 */
// Abstract class implementing the interface
public abstract class RoadAccidents implements iRoadAccidents {
    private String vehicleType;
    private String city;
    private int accidentTotal;

    // Constructor
    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    // Getters from the interface
    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getAccidentTotal() {
        return accidentTotal;
    }
}

