/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pluralsight.observerapiit;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Umanga
 */
//extends
public class Food extends Observable {
    
    
     private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String foodName;
    private String foodType;
    String availability;
    
    
    public Food(String productName, String productType,String availability) {
		super();
		this.foodName = productName;
		this.foodType = productType;
		this.availability=availability;
	}
	
	public ArrayList<Observer> getObservers() {
		return observers;
	}
	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

// add getters and setters
        public void setAvailability(String availability) {
		
			this.availability = availability;
			setChanged(); // call set changed
                     
			notifyObservers(this, availability);
		
	}
        // method
	public void notifyObservers(Observable observable,String availability) {
		System.out.println("Notifying to all the subscribers when product became available");
		 for (Observer ob : observers) {
             ob.update(observable,this.availability);
      }

	}

	public void registerObserver(Observer observer) {
		 observers.add(observer);
		
                 
	}

	public void removeObserver(Observer observer) {
		 observers.remove(observer);
		
	}
    
    
}
