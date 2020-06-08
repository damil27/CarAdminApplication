package com.project2.carapp.Repositories;

import com.project2.carapp.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
