package com.project2.carapp.Repositories;

import com.project2.carapp.Models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {
}
