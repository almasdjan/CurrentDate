package com.example.CurrentDate.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentDate {
    private LocalDate date;
    private LocalTime time;

    public CurrentDate() {
        this.date = LocalDate.now() ;
        this.time = LocalTime.now();
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }
}
