package com.project2.carapp.Services;

import com.project2.carapp.Models.Location;
import com.project2.carapp.Models.VehicleStatus;
import com.project2.carapp.Repositories.LocationRepository;
import com.project2.carapp.Repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VehicleStatusService {
    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;
    // return the list
    public List<VehicleStatus> getVehicleStatus(){ return vehicleStatusRepository.findAll();}
    // save new Location
    public void saveVehicle( VehicleStatus vehicleStatus){  vehicleStatusRepository.save(vehicleStatus);}
    // get location by id
    public Optional<VehicleStatus> vehicleStatusById(int id){ return vehicleStatusRepository.findById(id);}
    // delete location by id
    public void delete(int id){vehicleStatusRepository.deleteById(id);}
}
