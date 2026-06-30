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
        
        for(int i=0; i< appliances.size(); i++){
            Appliance appliance = appliances.get(i);
            
                System.out.println("-> APP-00" + (i + 1)+ " evaluated via "+ appliance.getClass().getSimpleName()+ "::calculateEnergyConsumption()");
                total += appliance.energyConsump();
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Device Breakdown:");

        for (int i = 0; i < appliances.size(); i++) {
            Appliance appliance = appliances.get(i);

            System.out.printf("- APP-%03d (%s) : %.3f kWh Logged Today%n",
                    i + 1,
                    appliance.getName(),
                    appliance.energyConsump());
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
