package com.example.aryan.lab1.services;
import org.springframework.stereotype.Service;
import com.example.aryan.lab1.entity.Location;

        @Service
public class LocationService {
            public Location getLocation;

            public Location getLocation(){
             return new Location(1,"Aryan","Kolkata");
             }
        }

