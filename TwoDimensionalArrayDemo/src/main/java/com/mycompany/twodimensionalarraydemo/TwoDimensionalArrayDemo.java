/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.twodimensionalarraydemo;

/**
 *
 * @author lab_services_student
 */
public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        // Creating an empty array with dimensions (5 rows and 5 columns)
        int[][] arr2D = new int[5][5];

        // Creating and populating a 2D array correctly
        int[][] arr2D1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Indexing / getting length of the first row of the 2D array
        int len = arr2D1[0].length;
        System.out.println("Length of first row: " + len);

        // Example loop to print the first row
        for (int i = 0; i < arr2D1[0].length; i++) {
            System.out.print(arr2D1[0][i] + " ");
        }
    }
}


