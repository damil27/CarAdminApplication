package com.project2.carapp.Repositories;

import com.project2.carapp.Models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
