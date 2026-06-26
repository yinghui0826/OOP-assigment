/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopgroupproject;

/**
 *
 * @author User
 */
public class EnergyUsageRecordClass {
    private String applianceId; //stores the appliance Id that the record belongs to 
    private double actualHours; //stores the actual hours of teh appliance that was used
    
    //creates a new energy usage record
    public EnergyUsageRecordClass(String applianceId,double actualHours){
        this.applianceId=applianceId;
        this.actualHours=actualHours;
    }
    
    public String getApplianceId(){
        return applianceId; //return the appliance Id
    }
    public double getActualHours(){
        return actualHours; //return the actual usage hours
    }
    
    //update the usage hours
    public void setActualHours(double actualHours){
        if(actualHours>=0){ //validation ensures the value is not negative
            this.actualHours=actualHours;
        }
    }
}
