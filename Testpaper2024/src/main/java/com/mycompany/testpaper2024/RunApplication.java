/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testpaper2024;

/**
 *
 * @author lab_services_student
 */
// Runner class with main method
public class RunApplication {
    public static void main(String[] args) {
        // Create some sample reports
        RoadAccidentReport report1 = new RoadAccidentReport("Car", "Cape Town", 155);
        RoadAccidentReport report2 = new RoadAccidentReport("Motorbike", "Johannesburg", 145);
        RoadAccidentReport report3 = new RoadAccidentReport("Car", "Port Elizabeth", 112);

        // Print the reports
        System.out.println("=== Road Accident Reports ===");
        report1.printAccidentReport();
        report2.printAccidentReport();
        report3.printAccidentReport();
    }
}

