package com.project2.carapp.Services;

import com.project2.carapp.Models.VehicleHire;
import com.project2.carapp.Models.VehicleMovement;
import com.project2.carapp.Repositories.VehicleHireRepository;
import com.project2.carapp.Repositories.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleHireService {
    @Autowired
    private VehicleHireRepository vehicleHireRepository;

    public List<VehicleHire> getVehicleHire(){
        return vehicleHireRepository.findAll();
    }

    public void saveVehicleHire( VehicleHire vehicleHire ){
        vehicleHireRepository.save(vehicleHire);
    }

    public Optional<VehicleHire> vehicleHireById(int id){
        return vehicleHireRepository.findById(id);
    }


    public void delete(Integer id) {
        vehicleHireRepository.deleteById(id);
    }

}
