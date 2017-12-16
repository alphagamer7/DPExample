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
public class Square implements Shape{
    double side=1.0;
    
    @Override
    public void draw() {
        System.out.println("drawing a Square...");
    }//end draw()

    @Override
    public double calcArea() {
        return Math.pow(side, 2);
    }//end calcArea()
    
}//end class Square
