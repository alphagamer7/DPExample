/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.prototype;

import java.util.Hashtable;

/**
 *
 * @author Chathura
 */
public class ShapeClient {
    Hashtable<String, Shape> shapeCollection = new Hashtable<String, Shape>();
    
    public void populateShapes(){
        Circle s1 = new Circle();
        s1.setId("S1");
        shapeCollection.put(s1.getId(), s1);
        
        Square s2 = new Square();
        s2.setId("S2");
        shapeCollection.put(s2.getId(), s2);        
    }  
    
    public Shape constructShape(String id){
        Shape shapeObj = shapeCollection.get(id);
        return (Shape)shapeObj.clone();
    }   
}
