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
    private String name;
    private double powerWatts;
    private double hoursPerDay;
    
    public Appliance (String name, double powerWatts, double hoursPerDay){
        setName(name);
        setPowerWatts(powerWatts);
        setHoursPerDay (hoursPerDay);
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
    public void setName(String name){
        if (name == null || name.isEmpty()){
            System.out.println("Error: Name cannot be empty. Using 'Unknown'.");
            this.name = "Unknown";
        }
        else {
            this.name = name;
        }
    }
    
    public void setPoweWatts (double powerWatts){
        if (powerWatts < 0){
            System.out.println("Eror: Power cannot be negative. setting it to 0.");
            this.powerWatts = 0;
        }
        else{
            this.powerWatts = powerWatts;
        }
    }
    
    public void setHourPerDay(double hoursPerDay){
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
    
    // print the appliance
    public void displayAppliance(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + getType());
        System.out.println("Power: " + powerWatts + "W");
        System.out.println("Usage: " + hoursPerDay + " hours/day");
        System.out.println("  Energy     : " + (Math.round(energyConsump() * 1000.0) / 1000.0) + " kWh/day");
    }
}
