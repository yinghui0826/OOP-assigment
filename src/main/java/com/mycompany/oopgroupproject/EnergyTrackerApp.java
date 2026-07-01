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

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        displayAndGetChoice();
    }

    public static void displayAndGetChoice() {
        System.out.println("\n===== Household Energy Tracker =====");
        System.out.println("1. Add New Appliance");
        System.out.println("2. Record Energy Usage");
        System.out.println("3. View All Appliances");
        System.out.println("4. Energy Summary Report");
        System.out.println("5. Identify High-Usage Appliances");
        System.out.println("6. View Energy-Saving Tips");
        System.out.println("7. Exit");
        System.out.print("Please choose an option (1-7): ");

        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
            System.out.print("Please choose an option (1-7): ");
            input.next();
        }

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Add");
                break;

            case 2:
                recordpage.main(new String[0]);   // Calls record page
                break;

            case 3:
                System.out.println("View All Appliances");
                break;

            case 4:
                System.out.println("Energy Summary");
                break;

            case 5:
                System.out.println("High Usage");
                break;

            case 6:
                System.out.println("Energy Saving Tips");
                break;

            case 7:
                System.out.println("Exiting system. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}