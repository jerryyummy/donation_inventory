package org.example;

import java.util.*;

public class DonationManagementSystem {
    private List<Record> records;
    private List<Distribution> distributions;

    public DonationManagementSystem() {
        this.records = new ArrayList<>();
        this.distributions = new ArrayList<>();
    }

    public void registerDonation(String donorName, String category, int amount, Date date) {
        records.add(new Record(donorName, category, amount, date));
    }

    public void recordDistribution(String category, int amount, Date date) {
        distributions.add(new Distribution(category, amount, date));
    }

    public void printInventoryReport() {
        System.out.println("Inventory Report:");
        Map<String, Integer> inventory = new HashMap<>();

        for (Record record : records) {
            inventory.put(record.category, inventory.getOrDefault(record.category, 0) + record.amount);
        }

        for (Distribution distribution : distributions) {
            inventory.put(distribution.type, inventory.getOrDefault(distribution.type, 0) - distribution.amount);
        }

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Type: " + entry.getKey() + ", Amount: " + entry.getValue());
        }
    }

    public void printDonatorReport() {
        System.out.println("Donator Report:");
        Map<String, Double> donatorTotals = new HashMap<>();

        for (Record record : records) {
            donatorTotals.put(record.name, donatorTotals.getOrDefault(record.name, 0.0) + record.amount);
        }

        for (Map.Entry<String, Double> entry : donatorTotals.entrySet()) {
            System.out.println("Donor: " + entry.getKey() + ", Total Contributions: " + entry.getValue());
        }
    }
}
