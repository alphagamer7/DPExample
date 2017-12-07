/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.template;

/**
 * @author Chathura
 */
public class Boat extends Vehicle {


    @Override
    public void accelerate() {
        System.out.println("accelerating boat... coming through");
    }

    @Override
    public void brake() {
        System.out.println("Slowing down boat applying brakes...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Boat...");
    }

}
