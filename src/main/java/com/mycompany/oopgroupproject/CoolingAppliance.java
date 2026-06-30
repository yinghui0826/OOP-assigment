/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopgroupproject;

/**
 *
 * @author qingyu
 */
public class CoolingAppliance{
    private String name;
    private double power;
    private double hours;      
    
    public CoolingAppliance() {

    }
    
    public CoolingAppliance(String name, double power, double hours){
        this.name=name;
        this.power=power;
        this.hours=hours;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPower(){
        return power;
    }
    public void setPower(double power){
        this.power=power;
    }
    public double getHours(){
        return hours;
    }
    public void setHours(double hours){
        this.hours=hours;
    }
    public double calculateEnergy(){
        return(power*hours)/1000;
    }
    public void displayInfo(){
         System.out.println("Cooling Appliance: " + name);
         System.out.println("Power: " + power + " W");
         System.out.println("Hours Used: " + hours);
         System.out.println("Energy: " + calculateEnergy() + " kWh");
    }
    
    
    
}
