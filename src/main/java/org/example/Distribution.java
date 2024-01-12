package org.example;

import java.util.Date;

public class Distribution {
    String category;
    int amount;
    Date date;

    public Distribution(String category, int amount, Date date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }
}
