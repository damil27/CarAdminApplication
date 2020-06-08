package com.project2.carapp.Controllers;

import com.project2.carapp.Models.EmployeeType;
import com.project2.carapp.Models.JobTitle;
import com.project2.carapp.Services.EmployeeTypeService;
import com.project2.carapp.Services.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeTypeController {

    @Autowired
    private EmployeeTypeService employeeTypeService;


    //return the list
    @GetMapping("/employeetypes")
    public String showEmployeeType(Model model){
        List<EmployeeType> employeeTypeList = employeeTypeService.getEmployeeType() ;
        model.addAttribute("employeeTypes", employeeTypeList);

        return "employeetype";
    }
    // save the details
    @PostMapping("/employeetypes/addNew")
    public String addEmployeeTypes( EmployeeType employeeType ){
        employeeTypeService.saveEmployeeType(employeeType);
        return "redirect:/employeetypes";
    }

    // get by id
    @RequestMapping("employeetypes/employeeTypeById")
    @ResponseBody
    public Optional<EmployeeType> showLocationById(int id){
        return  employeeTypeService.employeeTypeById(id) ;
    }
    // update by id
    @RequestMapping( value="employeetypes/update", method = { RequestMethod.PUT, RequestMethod.GET })
    public String updateEmployeeType( EmployeeType employeeType){
        employeeTypeService.saveEmployeeType(employeeType);
        return "redirect:/employeetypes";
    }

    // delete by id
    @RequestMapping("employeetypes/delete")
    public String delete(int id ){
        employeeTypeService.delete(id);
        return "redirect:/employeetypes";
    }





}
