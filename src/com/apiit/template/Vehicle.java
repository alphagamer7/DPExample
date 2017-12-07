/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.template;

/**
 * @author Chathura
 */
public abstract class Vehicle {
    public final void drive() {
        start();
        accelerate();
        brake();
        stop();
        stopEngine();
    }//end template method drive()

    public void start() {
        System.out.println("Starting vehical engine..");
    }

    public void stopEngine() {
        System.out.println("Stopping vehical engine..");
    }

    public abstract void accelerate();

    public abstract void brake();

    public abstract void stop();

}//end abstract class
