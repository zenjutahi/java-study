package com.introto.objectop.learnAbstract;

public class RecipeRunner {
    public static void main(String[] args){

        Recipe1 recipe1 = new Recipe1();
        System.out.println("Recipe one Procedure...");
        recipe1.execute();

        RecipeWithMicrowave recipe = new RecipeWithMicrowave();
        System.out.println("Recipe two Procedure...");
        recipe.execute();
    }
}
