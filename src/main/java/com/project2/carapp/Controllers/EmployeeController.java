package com.project2.carapp.Controllers;

import com.project2.carapp.Models.*;
import com.project2.carapp.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    //Country
    //State
    //EmployeeType
    //JobTitle
    @Autowired private  EmployeeService employeeService ;
    @Autowired private  CountryService countryService ;
    @Autowired private  StateService stateService;
    @Autowired private  EmployeeTypeService employeeTypeService ;
    @Autowired private  JobTitleService jobTitleService ;


    @GetMapping("/employees")
    public String showVehicle(Model model){
        List<Employee> employeeList = employeeService.getEmployee();
        model.addAttribute("employees", employeeList );

        List<Country> countryList = countryService.getCountry();
        model.addAttribute("countries", countryList);

        List<State> stateList = stateService.getState();
        model.addAttribute("states", stateList);

        List<EmployeeType> employeeTypeList = employeeTypeService.getEmployeeType();
        model.addAttribute("employeeTypes",employeeTypeList);

        List<JobTitle> jobTitleList = jobTitleService.getJobTitle();
        model.addAttribute("jobTitles", jobTitleList);



        return "employee";
    }

    @PostMapping("/employees/addNew")
    public  String addEmployee(Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @RequestMapping("employees/employeeById")
    @ResponseBody
    public Optional<Employee> employeeById(int id){
        return employeeService.employeeById(id);
    }

    @RequestMapping(value = "/employees/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update( Employee employee  ){
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @RequestMapping(value = "/employees/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        employeeService.delete(id);
        return "redirect:/employees";
    }




}
