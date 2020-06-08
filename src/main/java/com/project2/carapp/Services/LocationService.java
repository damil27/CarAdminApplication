package com.project2.carapp.Services;

import com.project2.carapp.Models.Location;
import com.project2.carapp.Repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired private LocationRepository locationRepository;
    // return the list
    public List<Location> getLocattion(){ return locationRepository.findAll();}
    // save new Location
    public void saveLocation(Location location){  locationRepository.save(location);}
    // get location by id
    public Optional<Location> locationById(int id){ return locationRepository.findById(id);}
    // delete location by id
    public void delete(int id){locationRepository.deleteById(id);}


}
