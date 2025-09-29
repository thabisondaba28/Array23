/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testpaper2024;

/**
 *
 * @author lab_services_student
 */
// Subclass extending RoadAccidents
public class RoadAccidentReport extends RoadAccidents {
    // Constructor
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    // Method to print accident details
    public void printAccidentReport() {
        System.out.println("Vehicle Type: " + getAccidentVehicleType());
        System.out.println("City        : " + getCity());
        System.out.println("Accidents   : " + getAccidentTotal());
        System.out.println("-----------------------------------");
    }
}

