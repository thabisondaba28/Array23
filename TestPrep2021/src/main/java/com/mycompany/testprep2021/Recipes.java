/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprep2021;

/**
 * Abstract class named Recipes.
 * Implements the iRecipes interface. [cite: 37]
 */
public abstract class Recipes implements iRecipes {

    // Variables to store the ingredients, time to make and the difficulty level. 
    private String ingredients;
    private int timeToMake;
    private int difficultyLevel;

    /**
     * Constructor that accepts the ingredients, time to make and difficulty level
     * as parameters. 
     */
    public Recipes(String ingredients, int timeToMake, int difficultyLevel) {
        this.ingredients = ingredients;
        this.timeToMake = timeToMake;
        this.difficultyLevel = difficultyLevel;
    }

    // Get methods for the variables. 

    public String getIngredients() {
        return ingredients;
    }

    public int getTimeToMake() {
        return timeToMake;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    // Note: The PrintRecipes() method from iRecipes is left abstract/unimplemented
    // in this class, or an abstract declaration could be added, 
    // but in modern Java it is more common to leave it for the first concrete class. 
    // Since ProcessRecipe is the concrete class, it will contain the implementation.
}
