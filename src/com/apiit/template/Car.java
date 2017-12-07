/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.template;

/**
 * @author Chathura
 */
public class Car extends Vehicle {


    @Override
    public void accelerate() {
        System.out.println("Accelerating Car to Max Speed....");
    }

    @Override
    public void brake() {
        System.out.println("Applying Car brakes... hold on");
    }

    @Override
    public void stop() {
        System.out.println("Park and Stop Car");
    }

}//end concrete class Car
