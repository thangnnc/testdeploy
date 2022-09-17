package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class StatusAPI {

    @GetMapping("/api/status")
    public HashMap doGetApiStatus(){
        HashMap<String, String> response = new HashMap<>();
        response.put("Status", "Running");
        return response;
    }

    @GetMapping("/status")
    public HashMap doGetStatus(){
        HashMap<String, String> response = new HashMap<>();
        response.put("Status", "Running");
        return response;
    }

}
