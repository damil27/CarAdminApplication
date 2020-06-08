package com.project2.carapp.Repositories;

import com.project2.carapp.Models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
