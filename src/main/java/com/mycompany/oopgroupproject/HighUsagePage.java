/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopgroupproject;

/**
 *
 * @author User
 */
public class HighUsagePage {
    public static void main(String[] args) {
        System.out.println("\n--- [5] IDENTIFY HIGH-USAGE APPLIANCES --- ");
        System.out.println("[ANALYSIS] Scanning household record arrays... ");
        System.out.println("CRITICAL CONSTRAINTS VIOLATION DETECTED: ---------------------------------------------------------------------- ");

        //Calculate total energy consumption across all registered devices first
        double totalConsumption = 0;
        for (Appliance app : application.appliances) {
            totalConsumption += app.energyConsump();
        }

        boolean foundHighUsage = false;

        //Loop through each appliance to see if it crosses the 5.0 kWh threshold
        for (Appliance app : application.appliances) {
            double individualConsumption = app.energyConsump();

            if (individualConsumption > 5.0) {
                foundHighUsage = true;
                
                //Calculate the percentage contribution of this single appliance
                double impactPercentage = (totalConsumption > 0) ? (individualConsumption / totalConsumption) * 100 : 0;

                //Print the exact alert block template matching your sample output
                System.out.printf(">> ALERT: [%s] \"%s\" is classified as a HIGH-USAGE APPLIANCE. %n", app.getId(), app.getName());
                System.out.println("     Reason: Individual consumption exceeds the threshold of 5.0 kWh/day. ");
                System.out.printf("     Impact: This single unit constitutes %.2f%% of total household energy drain. "
                        + "----------------------------------------------------------------------%n", impactPercentage);
            }
        }

        //Optional fallback check if no appliances cross 5.0 kWh
        if (!foundHighUsage) {
            System.out.println("[INFO] Healthy Status: No tracked devices are violating the 5.0 kWh/day benchmark constraint.");
            System.out.println("----------------------------------------------------------------------");
        }
    }
}
    

