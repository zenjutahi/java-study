package com.introto.objectop;

public class MotorBike {

    //state
    private int speed;
    // constructor
    MotorBike(int speed){
        this.speed = speed;
    }
    // create a getter
    int getSpeed(){
        return speed;
    }

    // creating a setter
    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        }
    }

    // increase speed method
    public void increaseSpeed(int howMuch){
        setSpeed(this.speed + howMuch);
    }
    // decrease speed method
    public void decreaseSpeed(int howMuch){
        setSpeed(this.speed - howMuch);
    }
    // Action or behavior
    public void start(){
        System.out.println("The Bike has Started!");
    }

}
