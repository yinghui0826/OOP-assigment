/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopgroupproject;

/**
 *
 * @author User
 */
import java.util.ArrayList;
public class EnergyReport {
    public static void generateReport(ArrayList<Appliance> appliances) {
        double total=0;
        
        System.out.println("\n--- [4] ENERGY SUMMARY REPORT ---");
        System.out.println("======================================================================");
        System.out.println("HOUSEHOLD METRICS REPORT");
        System.out.println("======================================================================");
        System.out.println("[POLYMORPHISM] Fetching customized energy algorithms...");
        
        for (Appliance appliance : appliances) {
            // Dynamically retrieves class names and standard IDs without hardcoding index prefixes
            System.out.println("-> " + appliance.getId() + " evaluated via " + appliance.getClass().getSimpleName() + "::calculateEnergyConsumption()");
            total += appliance.energyConsump();
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Device Breakdown:");

        for (Appliance appliance : appliances) {
            // Appends the mandatory (Inverter Adjusted) tag if it is a cooling appliance
            String trackingLabel = appliance.getType().equalsIgnoreCase("COOLING") ? " (Inverter Adjusted)" : "";
            System.out.printf("- %s (%s) : %.3f kWh Logged Today%s%n", 
                    appliance.getId(), 
                    appliance.getName(), 
                    appliance.energyConsump(), 
                    trackingLabel);
        }

        System.out.println("----------------------------------------------------------------------");

        double monthlyUsage = total * 30;
        double monthlyCost = monthlyUsage * 0.373; // Example tariff

        System.out.printf("Total Accumulative Usage : %.3f kWh / Day%n", total);
        System.out.printf("Projected Monthly Target : %.3f kWh%n", monthlyUsage);
        System.out.printf("Estimated Monthly Cost   : RM %.2f%n", monthlyCost);

        System.out.println("======================================================================");
    }
}
