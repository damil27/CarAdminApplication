package com.project2.carapp.Repositories;

import com.project2.carapp.Models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus,Integer> {
}
