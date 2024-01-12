package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DonationManagementSystem system = new DonationManagementSystem();

        // Sample registrations and distributions
        system.registerDonation("John Doe", "Money", 100, new Date());
        system.registerDonation("Jane Smith", "Food", 50, new Date());
        system.recordDistribution("Food", 20, new Date());

        // Print reports
        system.printInventoryReport();
        system.printDonatorReport();

    }
}