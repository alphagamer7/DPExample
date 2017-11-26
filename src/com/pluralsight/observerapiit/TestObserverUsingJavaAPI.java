/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pluralsight.observerapiit;


/**
 *
 * @author Umanga
 */
public class TestObserverUsingJavaAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                
    Student s1=new Student("Ama");
   Student s2=new Student("John");
    
    Food cake=new Food("Chocolate", "Butter", "Not available");
    
    //When you opt for option "Notify me when product is available".Below registerObserver method
    //get executed   
    
       cake.registerObserver(s1);
       cake.registerObserver(s2);
    
    //Now product is available
    cake.setAvailability("Available");
    
        // TODO code application logic here
        // TODO code application logic here
    }
    
}
