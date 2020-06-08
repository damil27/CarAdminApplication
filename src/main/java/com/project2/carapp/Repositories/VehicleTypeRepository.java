package com.project2.carapp.Repositories;

import com.project2.carapp.Models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {
}
