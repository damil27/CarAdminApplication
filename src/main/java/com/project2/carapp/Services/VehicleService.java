package com.project2.carapp.Services;

import com.project2.carapp.Models.Supplier;
import com.project2.carapp.Models.Vehicle;
import com.project2.carapp.Repositories.SupplierRepository;
import com.project2.carapp.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository ;


    public List<Vehicle> getVehicle(){
        return vehicleRepository.findAll();
    }

    public void saveVehicle(  Vehicle vehicle ){
        vehicleRepository.save(vehicle);
    }

    public Optional<Vehicle> vehicleById(int id){
        return vehicleRepository.findById(id);
    }


    public void delete(Integer id) {
        vehicleRepository.deleteById(id);
    }



}
