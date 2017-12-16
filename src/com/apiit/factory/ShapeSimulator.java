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
public class ShapeSimulator {
    public static void main(String[] args) {
        ShapeFactory shapefact = new ShapeFactory();
        
        Shape mycircle = shapefact.constructShape("Circle");
        mycircle.draw();
        System.out.println("Area: "+mycircle.calcArea());
        
        Shape mysquare = shapefact.constructShape("Square");
        mysquare.draw();
        System.out.println("Area: "+mysquare.calcArea());
        
        
        
    }//end main()  
}//end class ShapeSimular
