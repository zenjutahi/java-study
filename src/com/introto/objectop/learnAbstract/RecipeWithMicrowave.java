package com.introto.objectop.learnAbstract;

public class RecipeWithMicrowave extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get The raw material");
        System.out.println("Turn the microwave on");
    }

    @Override
    void doTheDish() {
        System.out.println("Prepare the meal required");
        System.out.println("Put the prepared meal in the microwave");
    }

    @Override
    void cleanup() {
        System.out.println("Clean the utensils");
        System.out.println("Turn of the microwave");
    }
}
