package com.project2.carapp.Services;

import com.project2.carapp.Models.Employee;
import com.project2.carapp.Models.State;
import com.project2.carapp.Models.Vehicle;

import com.project2.carapp.Repositories.EmployeeRepository;
import com.project2.carapp.Repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private  EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    public void saveEmployee( Employee employee){
        employeeRepository.save(employee);
    }

    public Optional<Employee> employeeById(int id){
        return employeeRepository.findById(id);
    }

    public void delete(int id){
        employeeRepository.deleteById(id);
    }



}
