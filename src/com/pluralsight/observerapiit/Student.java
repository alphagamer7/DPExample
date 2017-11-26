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


import java.util.Observable;
import java.util.Observer;
//new implements
public class Student implements Observer{
    
        String studentName;

	public Student(String personName) {
		this.studentName = personName;
	}

	public String getPersonName() {
		return studentName;
	}

	public void setPersonName(String personName) {
		this.studentName = personName;
	}

	
//new
    @Override
    public void update(Observable arg0, Object arg1) {
		System.out.println("Hello "+studentName+", Product is now "+arg1);
		
	}
    
    
}
