package com.project2.carapp.Repositories;

import com.project2.carapp.Models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMaintenenceRepository extends JpaRepository<VehicleMaintenance, Integer> {
}
