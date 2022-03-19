package com.introto.objectop.learnAbstract;

public abstract class AbstractRecipe {
    // eg make prepare, recipe and cleanup mandatory in all recipes
    // Helps us to define the basic algorithms for the classes extending it.
    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanup();


}
