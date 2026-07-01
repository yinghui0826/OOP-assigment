/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopgroupproject;

/**
 *
 * @author qingyu
 */
public class CoolingAppliance extends Appliance {
    
        private double hoursPerDay;

        public CoolingAppliance(String name, double powerWatts, double hoursPerDay) {
            super(name,powerWatts,hoursPerDay);
            this.hoursPerDay=hoursPerDay;
        }
        public double getHoursPerDay(){
            return hoursPerDay;
        }
        public void setHoursPerDay(double hoursPerDay){
            this.hoursPerDay=hoursPerDay;
        }
        public double calculateEnergy(){
            return(getPowerWatts()*hoursPerDay)/1000;
        }
        @Override
        public String getType() {
            return "Cooling Appliance";
        }
        @Override
        
        public String toString(){
             return "CoolingAppliance ["+
                     super.toString()+
                     ", Hours Per Day = "+hoursPerDay+
                     ", Energy = "+ calculateEnergy()+"kWh]";
        }   
    }

