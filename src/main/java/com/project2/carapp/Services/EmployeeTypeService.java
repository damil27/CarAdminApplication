package com.project2.carapp.Services;


import com.project2.carapp.Models.EmployeeType;
import com.project2.carapp.Repositories.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {
    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;
    // return the list
    public List<EmployeeType> getEmployeeType(){ return employeeTypeRepository.findAll() ;}
    // save new Location
    public void saveEmployeeType(EmployeeType employeeType){  employeeTypeRepository.save(employeeType);}
    // get location by id
    public Optional<EmployeeType> employeeTypeById(int id){ return employeeTypeRepository.findById(id);}
    // delete location by id
    public void delete(int id){employeeTypeRepository.deleteById(id);}
}
