/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopgroupproject;

/**
 *
 * @author bongd
 */
public class LightAppliance extends Appliance {
    private String bulbType;

    public LightAppliance(String name, double powerWatts, double hoursPerDay, String bulbType) {
        super(name, powerWatts, hoursPerDay);
        this.bulbType = bulbType;
    }

    public String getBulbType() {
        return bulbType;
    }

    public void setBulbType(String bulbType) {
        this.bulbType = bulbType;
    }

    @Override
    public String getType() {
        return "Lighting Appliance";
    }

    @Override
    public double energyConsump() {
        return super.energyConsump();
    }

    @Override
    public String getConfigDetails() {
        return "Type: " + bulbType;
    }
}
