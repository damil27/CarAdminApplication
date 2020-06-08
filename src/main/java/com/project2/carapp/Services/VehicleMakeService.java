package com.project2.carapp.Services;


import com.project2.carapp.Models.VehicleMake;
import com.project2.carapp.Repositories.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {
    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;
    // return the list
    public List<VehicleMake> getVehicleMake(){ return vehicleMakeRepository.findAll();}
    // save new Location
    public void saveVehicleMake(VehicleMake vehicleMake ){  vehicleMakeRepository.save(vehicleMake);}
    // get location by id
    public Optional<VehicleMake> vehicleMakeById(int id){ return vehicleMakeRepository.findById(id);}
    // delete location by id
    public void delete(int id){vehicleMakeRepository.deleteById(id);}
}
