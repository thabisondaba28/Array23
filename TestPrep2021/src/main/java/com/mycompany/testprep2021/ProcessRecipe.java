/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprep2021;

/**
 *
 * @author lab_services_student
 */
/**
 * Subclass called ProcessRecipe that extends the Recipes class. 
 */
public class ProcessRecipe extends Recipes {

    /**
     * Constructor to accept the ingredients, time to make and the difficulty level. 
     * It calls the superclass constructor to initialize the variables.
     */
    public ProcessRecipe(String ingredients, int timeToMake, int difficultyLevel) {
        super(ingredients, timeToMake, difficultyLevel);
    }

    /**
     * Implementation of the PrintRecipes() method from the iRecipes interface. 
     * This method displays the ingredients, time to make and the difficulty level.
     */
    @Override
    public void PrintRecipes() {
        // Use the get methods from the superclass (Recipes) to display the information.
        System.out.println("INGREDIENTS: " + getIngredients());
        System.out.println("TIME TO MAKE: " + getTimeToMake());
        System.out.println("DIFFICULTY LEVEL: " + getDifficultyLevel());
        System.out.println("\n****");
    }
}
