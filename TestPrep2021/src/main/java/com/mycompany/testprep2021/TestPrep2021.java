/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testprep2021;

/**
 *
 * @author lab_services_student
 */
public class TestPrep2021 {

    public static void main(String[] args) {
        // 1. Declaration and Population of Two-Dimensional Array (8 Marks)
        // Rows: 3 Years (2018, 2019, 2020)
        // Columns: 3 Months (JAN, FEB, MAR)
        
        int[][] deliveries = {
            // JAN, FEB, MAR
            {128, 135, 139}, // DELIVERIES 2018
            {155, 129, 175}, // DELIVERIES 2019
            {129, 130, 185}  // DELIVERIES 2020
        };

        // Array to hold the year labels for printing
        String[] yearLabels = {"DELIVERIES 2018", "DELIVERIES 2019", "DELIVERIES 2020"};
        // Array to hold the month labels for the header
        String[] monthLabels = {"JAN", "FEB", "MAR"};

        // Variables for statistics calculation (7 Marks)
        int totalDeliveries = 0;
        int maxDeliveries = deliveries[0][0]; // Initialize with the first element
        int minDeliveries = deliveries[0][0]; // Initialize with the first element
        int count = 0; // To count total number of entries for average
        
        // 2. Report Output and Statistics Calculation
        
        // Printing the header and report title (3 Marks)
        System.out.println("DELIVERIES REPORT");
        System.out.println("-----------------");
        
        // Print Month Header (JAN, FEB, MAR)
        System.out.printf("%-17s", ""); // Spacing for the Year/Deliveries column
        for (String month : monthLabels) {
            System.out.printf("%-6s", month);
        }
        System.out.println();

        // Loop through the array to print rows and columns and calculate statistics
        // Printing of the rows and columns (7 Marks)
        for (int i = 0; i < deliveries.length; i++) { // Outer loop for years (rows)
            // Print Year/Deliveries label
            System.out.printf("%-17s", yearLabels[i]);

            for (int j = 0; j < deliveries[i].length; j++) { // Inner loop for months (columns)
                int delivery = deliveries[i][j];
                
                // Print the delivery value
                System.out.printf("%-6d", delivery);

                // Calculate Total Deliveries
                totalDeliveries += delivery;
                
                // Determine Maximum Deliveries
                if (delivery > maxDeliveries) {
                    maxDeliveries = delivery;
                }
                
                // Determine Minimum Deliveries
                if (delivery < minDeliveries) {
                    minDeliveries = delivery;
                }
                
                // Count the total number of entries
                count++;
            }
            System.out.println();
        }

        // Calculate Average Deliveries (to cover the 'average' mention in the marking guideline)
        double averageDeliveries = (double) totalDeliveries / count;

        // 3. Printing the Deliveries Statistics (3 Marks)
        System.out.println("\nDELIVERIES STATISTICS");
        System.out.println("---------------------");
        
        // Total Deliveries
        System.out.println("Total Deliveries: " + totalDeliveries); // Expected: 1305 
        
        // Maximum Deliveries
        System.out.println("Maximum Deliveries: " + maxDeliveries); // Expected: 185 
        
        // Minimum Deliveries
        System.out.println("Minimum Deliveries: " + minDeliveries); // Expected: 128 
        
        // (Optional: Include Average to satisfy the marking guideline's detailed requirement)
        // System.out.printf("Average Deliveries: %.2f\n", averageDeliveries);
    }
}
