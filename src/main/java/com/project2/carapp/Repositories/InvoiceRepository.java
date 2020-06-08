package com.project2.carapp.Repositories;

import com.project2.carapp.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
