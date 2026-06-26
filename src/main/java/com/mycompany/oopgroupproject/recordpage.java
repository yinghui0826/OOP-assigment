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
        // Show available appliances
        System.out.println("Available Tracked Devices:");
        System.out.println("[APP-001] Living Room Chandelier");
        System.out.println("[APP-002] Master Bedroom AC");

        // Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Appliance ID to update: ");
        String applianceId = sc.nextLine();

        double hours;
        do{
            System.out.print("Enter actual hours operated: ");
            hours = sc.nextDouble();

            if(hours < 0){
                System.out.println("[ERROR] Hours cannot be negative.");
            }

        }while(hours < 0);

        // Create usage record
        EnergyUsageRecordClass usageRecord = new EnergyUsageRecordClass(applianceId, hours);
        System.out.println("[SUCCESS] EnergyUsageRecord updated for "+ applianceId + ". (" + hours + " hours logged).");
    }
}
