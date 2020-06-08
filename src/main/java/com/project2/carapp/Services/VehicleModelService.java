package com.project2.carapp.Services;

import com.project2.carapp.Models.Location;
import com.project2.carapp.Models.VehicleModel;
import com.project2.carapp.Repositories.LocationRepository;
import com.project2.carapp.Repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {
    @Autowired
    private VehicleModelRepository vehicleModelRepository;
    // return the list
    public List<VehicleModel> getVehicleModel(){ return vehicleModelRepository.findAll();}
    // save new Location
    public void savevehicleModel(VehicleModel vehicleModel ){  vehicleModelRepository.save(vehicleModel);}
    // get location by id
    public Optional<VehicleModel> vehicleModelById(int id){ return vehicleModelRepository.findById(id);}
    // delete location by id
    public void delete(int id){vehicleModelRepository.deleteById(id);}
}
