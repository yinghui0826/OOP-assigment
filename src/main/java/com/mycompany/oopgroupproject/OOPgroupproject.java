/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopgroupproject;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class OOPgroupproject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        
        while (running){
            System.out.println("\n=== HOUSEHOLD ENERGY TRACKER SYSTEM MAIN MENU ===");
            System.out.println("1. Add Appliance");
            System.out.println("2. View All Appliances");
            System.out.println("3. Calculate Total Energy Consumption");
            System.out.println("4. View Average Energy Consumption");
            System.out.println("5. View Highest Energy-Consuming Appliance");
            System.out.println("6. View Energy Cost Estimate");
            System.out.println("7. Display Full Energy Report");
            System.out.println("8. Exit");
            System.out.print("Please choose an option (1-8): ");
            
            // Check if user entered a valid number
            if (input.hasNextInt()) {
                int choice = input.nextInt();

                // Process selection
                switch (choice) {
                    case 1:
                        System.out.println("Directing to Add Appliance....");
                        break;
                    case 2:
                        System.out.println("Directing to View All Appliances...");
                        break;
                    case 3:
                        System.out.println("Directing to Calculate Total Energy Consumption...");
                        break;
                    case 4:
                        System.out.println("Directing to View Average Energy Consumption...");
                        break;
                    case 5:
                        System.out.println("Directing to View Highest Energy-Consuming Appliance...");
                        break;
                    case 6:
                        System.out.println("Directing to View Energy Cost Estimate...");
                        break;
                    case 7:
                        System.out.println("Directing to Display Full Energy Report...");
                        break;
                    case 8:
                        System.out.println("Thank you for using our software. Goodbye!");
                        running = false; // Break the main menu loop
                        break;
                    default:
                        System.out.println("Error: Choice out of range. Please enter 1 or 2 or 3.....");
                }
            } else {
                System.out.println("Error: Invalid entry. Please enter a valid integer.");
                input.next(); // Clear out the invalid input
            }
        }
        input.close();
    }
}
