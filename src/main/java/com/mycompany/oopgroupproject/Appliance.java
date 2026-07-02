/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopgroupproject;

/**
 *
 * @author Dell
 */
public class Appliance {
    //instance variable - encapsulation
    private static int idCounter =1;
    private String id;
    private String name;
    private double powerWatts;
    private double hoursPerDay;
    
    //behaviour - methods 
    
    //constructorSS
    //no need return type eg.void
    //method name follows the clas name
    public Appliance (String name, double powerWatts, double hoursPerDay){ //parameterized constructor 
        this.id = String.format("APP-%03d", idCounter ++);
        setName(name);
        setPowerWatts(powerWatts);
        setHoursPerDay(hoursPerDay);
    }
    
    public String getId() { 
        return id; 
    }
    
    public String getName(){
        return name;
    }
    
    public double getPowerWatts(){
        return powerWatts;
    }
    
    public double getHoursPerDay(){
        return hoursPerDay;
    }
    
    //change private values
    public final void setName(String name){
        if (name == null || name.isEmpty()){
            System.out.println("Error: Name cannot be empty. Using 'Unknown'.");
            this.name = "Unknown";
        }
        else {
            this.name = name;
        }
    }
    
    public void setPowerWatts (double powerWatts){
        if (powerWatts < 0){
            System.out.println("Eror: Power cannot be negative. setting it to 0.");
            this.powerWatts = 0;
        }
        else{
            this.powerWatts = powerWatts;
        }
    }
    
    public void setHoursPerDay(double hoursPerDay){
        if (hoursPerDay < 0){
            System.out.println("Error: Hours cannot be in negative. Stiing it to 0.");
        }
        else{
            this.hoursPerDay = hoursPerDay;
        }
    }
    
    //calculate the appliance use per day 
    public double energyConsump(){
        return (powerWatts * hoursPerDay)/ 1000.0;
    }
    
    public String getType(){
        return "General Appliance";
    }
    
    public String getConfigDetails() { 
        return "N/A"; 
    }
    
    // print the appliance
    public void displayAppliance(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + getType());
        System.out.println("Power: " + powerWatts + "W");
        System.out.println("Usage: " + hoursPerDay + " hours/day");
        System.out.println("  Energy     : " + (Math.round(energyConsump() * 1000.0) / 1000.0) + " kWh/day");
    }
}
