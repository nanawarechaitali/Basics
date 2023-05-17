package com.basics;
abstract class Car{
    Car(){
        System.out.println("car is built.");
    }
    abstract void drive();
    void gearChange(){
        System.out.println("Gearchanged!!");
    }

}

