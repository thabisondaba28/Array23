/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprep2021;
import java.util.Scanner;


public class BakingApplication {

    public static void main(String[] args) {
        
        // Use Scanner for capturing user input
        Scanner scanner = new Scanner(System.in);

        // Capture Input
        
        System.out.print("Enter the ingredients: "); // Example Input: eggs, flour, salt, baking soda and coco 
        String ingredients = scanner.nextLine();
        
        System.out.print("Enter time to make (in minutes): "); // Example Input: 180 
        // Input validation is omitted for brevity but should be considered in a real application.
        int timeToMake = scanner.nextInt();
        
        System.out.print("Enter difficulty level: "); // Example Input: 5 
        int difficultyLevel = scanner.nextInt();
        
        // Instantiate the ProcessRecipes class. [cite: 42]
        ProcessRecipe myRecipe = new ProcessRecipe(ingredients, timeToMake, difficultyLevel);
        
        System.out.println(); // New line for cleaner output

        // Call the PrintRecipes method to display the captured information.
        myRecipe.PrintRecipes(); 

        scanner.close();
    }
}