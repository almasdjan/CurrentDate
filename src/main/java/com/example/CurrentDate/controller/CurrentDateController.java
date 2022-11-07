package com.example.CurrentDate.controller;

import com.example.CurrentDate.model.CurrentDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentDateController {

    @GetMapping("/")
    public CurrentDate getCurrentTime(){
        return new CurrentDate();

    }
}