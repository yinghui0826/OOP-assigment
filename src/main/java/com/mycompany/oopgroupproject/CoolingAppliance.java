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
    
        private int starRating;

        public CoolingAppliance(String name, double powerWatts, double hoursPerDay, int starRating) {
            super(name,powerWatts,hoursPerDay);
            this.starRating = starRating;
        }
        public int getStarRating(){
            return starRating;
        }
        public void setStarRating(int starRating){
            this.starRating = starRating;
        }
        
        @Override
        public String getType() {
            return "Cooling Appliance";
        }
        @Override
        public String getConfigDetails() { 
            return "Rating: " + starRating + "-Star"; 
        }
        
        @Override
        public double energyConsump() {
            return (getPowerWatts() * getHoursPerDay() * 0.9) / 1000.0;
        }   
}

