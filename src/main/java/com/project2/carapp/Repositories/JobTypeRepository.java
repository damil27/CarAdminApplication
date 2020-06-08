package com.project2.carapp.Repositories;

import com.project2.carapp.Models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTypeRepository extends JpaRepository<JobTitle,Integer> {
}
