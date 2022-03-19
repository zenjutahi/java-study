package com.introto.objectop.learnAbstract;

public class Recipe1 extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get The raw material");
        System.out.println("Get the utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the dish");
    }

    @Override
    void cleanup() {
        System.out.println("Clean the utensils");
    }
}
