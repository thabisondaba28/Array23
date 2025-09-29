/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testpaper2024;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;

public class Testpaper2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Single-dimensional array for city names
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        // 2D array for accidents [row = city][col = 0=Car, 1=Bike]
        int[][] accidents = new int[3][2];

        // Input accidents for each city
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Enter number of Car accidents in " + cities[i] + ": ");
            accidents[i][0] = sc.nextInt();

            System.out.println("Enter number of Motorbike accidents in " + cities[i] + ": ");
            accidents[i][1] = sc.nextInt();
        }

        System.out.println("\n=== Road Accident Report ===");
        System.out.printf("%-15s %-10s %-10s %-10s%n", "City", "Cars", "Bikes", "Total");

        int highestTotal = 0;
        String highestCity = "";

        // Display table and calculate totals
        for (int i = 0; i < cities.length; i++) {
            int total = accidents[i][0] + accidents[i][1];
            System.out.printf("%-15s %-10d %-10d %-10d%n", cities[i], accidents[i][0], accidents[i][1], total);

            // Check for city with highest accidents
            if (total > highestTotal) {
                highestTotal = total;
                highestCity = cities[i];
            }
        }

        System.out.println("\nCity with the highest number of accidents: " 
                           + highestCity + " (" + highestTotal + " accidents)");
    }
}

