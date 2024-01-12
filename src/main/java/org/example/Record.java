package org.example;

import java.util.Date;

public class Record {
    String name;
    String category;
    int amount;
    Date date;

    public Record(String name, String category, int amount, Date date) {
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.date = date;
    }
}
