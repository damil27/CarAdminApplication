package com.project2.carapp.Repositories;

import com.project2.carapp.Models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
