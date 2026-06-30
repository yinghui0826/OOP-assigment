/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopgroupproject;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class EnergyTrackerApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Household household = new Household();

        boolean running = true;

        while (running) {

            System.out.println(" Household Energy Tracker ");
            System.out.println("1. Add New Appliance");
            System.out.println("2. Record Energy Usage");
            System.out.println("3. View All Appliances");
            System.out.println("4. Energy Summary Report");
            System.out.println("5. Identify High-Usage Appliances");
            System.out.println("6. View Energy-Saving Tips");
            System.out.println("7. Exit");
            System.out.print("Please choose an option (1-7): ");

            if (input.hasNextInt()) {

                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println("");
                        break;
                         
                    case 2:
                        System.out.println("");
                        break;

                    case 3:
                        System.out.printf("Total Energy Consumption: %.2f kWh%n", household.calculateTotalConsumption());
                        break;

                    case 4:
                        System.out.printf("Average Energy Consumption: %.2f kWh%n", household.calculateAverageConsumption());
                        break;

                    case 5:
                        household.findHighestConsumptionAppliance();
                        break;

                    case 6:
                        household.generateReport();
                        break;

                    case 7:
                        System.out.println("Thank you for using our software. Goodbye!");
                        running = false;
                        break;

                    default:
                        System.out.println("Error: Please enter a number between 1 and 7.");
                }

            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                input.next();
            }
        }

        input.close();
    }
    
}
