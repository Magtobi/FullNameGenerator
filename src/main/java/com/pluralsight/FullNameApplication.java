package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = myScanner.nextLine().trim();

        System.out.println("Please enter your middle name (or press Enter to skip): ");
        String middleName = myScanner.nextLine().trim();

        System.out.println("Please enter your last name: ");
        String lastName = myScanner.nextLine().trim();

        System.out.println("Please enter your suffix (or press Enter to skip): ");
        String suffix = myScanner.nextLine().trim();

                System.out.println("Your full name is: " + firstName + " " + middleName + " " + lastName + "," + suffix);

                myScanner.close();


    }
}
