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
public class Heart implements Shape{
     private String color;   

    public void setColor(String color) {
        this.color = color;
    }

    

    @Override
    public void draw() {
        System.out.println("drawing a heart coloured "+color);
    }

    public String getColor() {
        return color;
    }
}
