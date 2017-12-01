/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.flyweight;

/**
 *
 * @author Chathura
 */
public class ShapeSimulator {
    public static void main(String[] args) {
        ShapeFactory sfact = new ShapeFactory();
        
        sfact.populate();
        Heart myheartshape1 = (Heart)sfact.constructHeart("red");
        Heart myheartshape2 = (Heart)sfact.constructHeart("blue");
        Heart myheartshape3 = (Heart)sfact.constructHeart("green");
        Heart myheartshape4 = (Heart)sfact.constructHeart("white");
        myheartshape1.draw();
        myheartshape2.draw();
        myheartshape3.draw();
        myheartshape4.draw();
        
    
    }
}
