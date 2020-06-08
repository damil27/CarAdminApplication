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
public class VehicleControlller {

    @Autowired private VehicleService vehicleService;
    @Autowired private VehicleTypeService vehicleTypeService;
    @Autowired private VehicleMakeService vehicleMakeService;
    @Autowired private VehicleStatusService vehicleStatusService;
    @Autowired private EmployeeService employeeService;
    @Autowired private VehicleModelService vehicleModelService;
    @Autowired private LocationService locationService;


    @GetMapping("/vehicles")
    public String showVehicle(Model model){
        List<Vehicle> vehicleList = vehicleService.getVehicle();
        model.addAttribute("vehicles", vehicleList);

        List<VehicleType> vehicleTypeList = vehicleTypeService.getVehicleType();
        model.addAttribute("vehicleTypes", vehicleTypeList);

        List<VehicleMake> vehicleMakeList = vehicleMakeService.getVehicleMake();
        model.addAttribute("vehicleMakes", vehicleMakeList);

        List<VehicleStatus> vehicleStatusList = vehicleStatusService.getVehicleStatus();
        model.addAttribute("vehicleStatuses", vehicleStatusList);


        List<VehicleModel> vehicleModelList = vehicleModelService.getVehicleModel();
        model.addAttribute("vehicleModels", vehicleModelList);

        List<Location> locationList = locationService.getLocattion();
        model.addAttribute("locations", locationList);


        List<Employee> employeeList = employeeService.getEmployee();
        model.addAttribute("employees", employeeList);

        return "vehicle";
    }

    @PostMapping("/vehicles/addNew")
    public  String addVehicle(Vehicle vehicle){
        vehicleService.saveVehicle(vehicle);
        return "redirect:/vehicles";
    }

    @RequestMapping("vehicles/vehicleById")
    @ResponseBody
    public Optional<Vehicle> vehicleById(int id){
        return vehicleService.vehicleById(id);
    }

    @RequestMapping(value = "/vehicles/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Vehicle vehicle ){
        vehicleService.saveVehicle(vehicle);
        return "redirect:/vehicles";
    }

    @RequestMapping(value = "/vehicles/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        vehicleService.delete(id);
        return "redirect:/vehicles";
    }



}
