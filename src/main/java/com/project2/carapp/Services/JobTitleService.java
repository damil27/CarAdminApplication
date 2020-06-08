package com.project2.carapp.Services;

import com.project2.carapp.Models.JobTitle;
import com.project2.carapp.Models.Location;
import com.project2.carapp.Repositories.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {
    @Autowired
    private JobTitleRepository jobTitleRepository ;
    // return the list
    public List<JobTitle> getJobTitle(){ return jobTitleRepository.findAll();}
    // save new Location
    public void saveJobTitle( JobTitle jobTitle){  jobTitleRepository.save(jobTitle);}
    // get location by id
    public Optional<JobTitle>jobTitleById(int id){ return jobTitleRepository.findById(id);}
    // delete location by id
    public void delete(int id){jobTitleRepository.deleteById(id);}
}
