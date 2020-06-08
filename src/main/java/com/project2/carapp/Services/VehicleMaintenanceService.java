package com.project2.carapp.Services;

import com.project2.carapp.Models.Supplier;
import com.project2.carapp.Models.VehicleMaintenance;
import com.project2.carapp.Repositories.SupplierRepository;
import com.project2.carapp.Repositories.VehicleMaintenenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMaintenanceService {

    @Autowired
    private VehicleMaintenenceRepository vehicleMaintenenceRepository;


    public List<VehicleMaintenance> getVehicleMain(){
        return vehicleMaintenenceRepository.findAll();
    }

    public void saveVehicleMain( VehicleMaintenance vehicleMaintenance ){
        vehicleMaintenenceRepository.save(vehicleMaintenance);
    }

    public Optional<VehicleMaintenance> vehicleMainById(int id){
        return  vehicleMaintenenceRepository.findById(id);
    }


    public void delete(Integer id) {
        vehicleMaintenenceRepository.deleteById(id);
    }


}
