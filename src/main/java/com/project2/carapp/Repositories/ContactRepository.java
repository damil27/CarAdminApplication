package com.project2.carapp.Repositories;

import com.project2.carapp.Models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
