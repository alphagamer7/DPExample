/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.template;

/**
 * @author Chathura
 */
public class VehicleSimulator {
    public static void main(String[] args) {
        Vehicle jaguar1 = new Car();
        jaguar1.drive();

        System.out.println("-----------");
        Vehicle blackPearl = new Boat();
        blackPearl.drive();

        System.out.println("-------------");
        Vehicle airbus = new Plane();
        airbus.drive();
    }
}
