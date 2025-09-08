package com.example.aryan.lab1.controller;
import com.example.aryan.lab1.entity.Location;
import com.example.aryan.lab1.services.LocationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class LocationController {
    public final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/location")
    public Location getLocation(){
        return locationService.getLocation();
    }
}


