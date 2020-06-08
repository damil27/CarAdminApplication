package com.project2.carapp.Repositories;

import com.project2.carapp.Models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {
}
