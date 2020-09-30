package com.java.services;

import com.java.model.Location;
import com.java.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServices {

    private final LocationRepository locationRepository;

    public LocationServices(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<Location> getAll(){
        return locationRepository.findAll ();
    }

    public Location getById(Long id){
        return locationRepository.findById ( id ).orElse ( null );
    }

    public Location create(Location location){
        return locationRepository.save ( location );
    }

    public Location update(Location location){
        return locationRepository.save ( location );
    }

    public void delete(Long id){
        locationRepository.deleteById ( id );
    }
}
