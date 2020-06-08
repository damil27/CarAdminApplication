package com.project2.carapp.Repositories;

import com.project2.carapp.Models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {
}
