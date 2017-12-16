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
public class ShapeFactory {
    public Shape constructShape(String shapeName){
        Shape shapeObj= null;
        if(shapeName.equals("Circle")){
            shapeObj = new Circle();
        }else if(shapeName.equals("Square")){
            shapeObj = new Square();
        }
        return shapeObj;
    }
}







