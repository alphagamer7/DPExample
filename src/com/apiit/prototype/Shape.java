/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chathura
 */
public abstract class Shape implements Cloneable{
    String id;
    String type;
    
    public abstract void draw();

    @Override
    protected Object clone() {
        Shape shapeObj = null;
        try {
            shapeObj =(Shape)super.clone(); 
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return shapeObj;
    }//end overridden clone()  

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
