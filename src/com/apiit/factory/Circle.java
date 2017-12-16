/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.factory;

/**
 *
 * @author Chathura
 */
public class Circle implements Shape{
    double radius = 1.0;
        
    @Override
    public void draw() {
        System.out.println("drawing a Circle...");
    }//end draw()

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }//end calcArea()
    
}
