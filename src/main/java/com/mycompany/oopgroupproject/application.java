/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopgroupproject;

/**
 *
 * @author bongd
 */
import java.util.ArrayList;
public class application {
    static ArrayList<Appliance> appliances = new ArrayList<>();
    public static void main(String[] args) {
        
        System.out.println("\n--- [3] VIEW ALL APPLIANCES --- ");
        System.out.println("Total Registered Devices: " + appliances.size() + " ");
        System.out.println("------------------------------------------------------------------------------------------------------ ");
        System.out.printf("%-8s %-10s %-25s %-13s %-20s%n", "ID", "Type", "Appliance Name", "Rating (W)", "Config Details");
        System.out.println("------------------------------------------------------------------------------------------------------- ");

        if (appliances.isEmpty()) {
            System.out.println("No appliances registered yet.");
        } else {
            for (Appliance appliance : appliances) {
                System.out.printf("%-8s %-10s %-25s %-13s %-20s%n",
                        appliance.getId(),
                        appliance.getType(),
                        appliance.getName(),
                        (int)appliance.getPowerWatts() + "W",
                        appliance.getConfigDetails());
            }
        }
        System.out.println("----------------------------------------------------------------------------- -------------------------------");
    }
}

