/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopgroupproject;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class recordpage {
    public static void main(String[] args) {
        System.out.println("\n--- [2] RECORD ENERGY USAGE ---");
        
        //Check if there are any devices registered in the shared array list
        if (application.appliances.isEmpty()) {
            System.out.println("Available Tracked Devices: None registered.");
            return;
        }
        
        System.out.println("Available Tracked Devices: ");
        for (Appliance app : application.appliances) {
            System.out.println("\t[" + app.getId() + "] " + app.getName());
        }

        // Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Appliance ID to update: ");
        String applianceId = sc.nextLine();
        
        //Search for the appliance matching the inputted ID
        Appliance selectedApp = null;
        for (Appliance app : application.appliances) {
            if (app.getId().equalsIgnoreCase(applianceId)) {
                selectedApp = app;
                break;
            }
        }

        // Error message if ID doesn't exist
        if (selectedApp == null) {
            System.out.println("[ERROR] Device not found.");
            return;
        }

        //Get and validate hours operated matching your sample formatting
        double hours;
        while (true) {
            System.out.print("Enter actual hours operated for this tracking record: ");
            hours = sc.nextDouble();
            
            if (hours >= 0 && hours <= 24) {
                break;
            }
            System.out.println("[ERROR] Invalid Entry! Daily usage duration cannot exceed 24 hours.");
        }

        //Save the updated hours back into the appliance object so the Summary Report changes
        selectedApp.setHoursPerDay(hours);  
        System.out.println("[SUCCESS] EnergyUsageRecord updated for " + selectedApp.getId() + ". (" + hours + " hours logged). ----------------------------------------------------------------------");
    }
}
