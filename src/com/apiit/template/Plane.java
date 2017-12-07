/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.template;

/**
 * @author Chathura
 */
public class Plane extends Vehicle {


    @Override
    public void accelerate() {
        System.out.println("Accelerating plane....");
    }

    @Override
    public void brake() {
        System.out.println("Auto pilot mode on...");
    }

    @Override
    public void stop() {
        System.out.println("Landing plane...");
    }

}
