/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.prototype;

/**
 *
 * @author Chathura
 */
public class Square extends Shape{

    public Square() {
        type="Square";
    }

    
    
    @Override
    public void draw() {
        System.out.println("drawing a Square");
    }
    
}