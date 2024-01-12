package org.example;

import java.util.Date;

public class Distribution {
    String type;
    int amount;
    Date date;

    public Distribution(String type, int amount, Date date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }
}
