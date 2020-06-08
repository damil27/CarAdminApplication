package com.project2.carapp.Repositories;

import com.project2.carapp.Models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement,Integer> {
}
