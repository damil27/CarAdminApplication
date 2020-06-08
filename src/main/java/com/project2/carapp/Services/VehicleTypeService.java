package com.project2.carapp.Services;

import com.project2.carapp.Models.EmployeeType;
import com.project2.carapp.Models.Location;
import com.project2.carapp.Models.VehicleType;
import com.project2.carapp.Repositories.LocationRepository;
import com.project2.carapp.Repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VehicleTypeService {
    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;
    // return the list
    public List<VehicleType> getVehicleType(){ return vehicleTypeRepository.findAll() ;}
    // save new Location
    public void saveVehicleType(VehicleType vehicleType){  vehicleTypeRepository.save(vehicleType);}
    // get location by id
    public Optional<VehicleType> vehicleTypeById(int id){ return vehicleTypeRepository.findById(id);}
    // delete location by id
    public void delete(int id){vehicleTypeRepository.deleteById(id);}
}
