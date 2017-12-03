///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package testobserver;
//import java.util.ArrayList;
//
///**
// *
// * @author Umanga
// */
//public class Food implements Subject {
//
//
//    private ArrayList<Observer> observers = new ArrayList<Observer>();
//    private String foodName;
//    private String foodType;
//    String availability;
//
//
//	public Food(String productName, String productType,String availability) {
//		super();
//		this.foodName = productName;
//		this.foodType = productType;
//		this.availability=availability;
//	}
//
//	public ArrayList<Observer> getObservers() {
//		return observers;
//	}
//	public void setObservers(ArrayList<Observer> observers) {
//		this.observers = observers;
//	}
//
//
//	public void setAvailability(String availability) {
//		this.availability = availability;
//		notifyObservers();
//	}
//
//	public void notifyObservers() {
//		System.out.println("Notifying to all the subscribers when product became available");
//		 for (Observer ob : observers) {
//             ob.update(this.availability );
//      }
//
//	}
//
//	public void registerObserver(Observer observer) {
//		 observers.add(observer);
//
//	}
//
//	public void removeObserver(Observer observer) {
//		 observers.remove(observer);
//
//	}
//}
