/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.flyweight;

import java.util.HashMap;

/**
 *
 * @author Chathura
 */
public class ShapeFactory {
    HashMap<String, Shape> shapeCollection = new HashMap<String, Shape>();
    
    public void populate(){
        Heart s1 = new Heart();
        s1.setColor("red");
        shapeCollection.put(s1.getColor(), s1);
        
        Heart s2 = new Heart();
        s2.setColor("blue");
        shapeCollection.put(s2.getColor(), s2);
        
        Heart s3 = new Heart();
        s3.setColor("black");
        shapeCollection.put(s3.getColor(), s3);        
    }
    
    public Shape constructHeart(String color){
        Heart heartShape = new Heart();
        heartShape.setColor(color);
        
        if(shapeCollection.get(color)==null){
            shapeCollection.put(color, heartShape);
            System.out.println("creating a new heart of colour "+color);
        }
        return heartShape;
    }
}
