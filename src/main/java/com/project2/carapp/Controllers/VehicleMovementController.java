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
public class VehicleMovementController {
    @Autowired
    private VehicleMovementService vehicleMovementService;
    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private LocationService locationService;
    

    @GetMapping("/vehiclemovements")
    public String showVehicleMovement(Model model){
        List<VehicleMovement> vehicleMoveList = vehicleMovementService.getVehicleMove();
        model.addAttribute("vehiclemovements", vehicleMoveList);

        List<Vehicle> vehicleList = vehicleService.getVehicle();
        model.addAttribute("vehicles", vehicleList);

        List<Location> locationList = locationService.getLocattion();
        model.addAttribute("locations", locationList);

        return "vehiclemovement";
    }

    @PostMapping("/vehiclemovements/addNew")
    public  String addVehicleMove(VehicleMovement vehiclemovement){
        vehicleMovementService.saveVehicleMove(vehiclemovement);
        return "redirect:/vehiclemovements";
    }

    @RequestMapping("vehiclemovements/vehicleMoveId")
    @ResponseBody
    public Optional<VehicleMovement> vehicleMoveById(int id){
        return vehicleMovementService.vehicleMoveById(id);
    }

    @RequestMapping(value = "/vehiclemovements/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleMovement vehiclemovement ){
        vehicleMovementService.saveVehicleMove(vehiclemovement);
        return "redirect:/vehiclemovements";
    }

    @RequestMapping(value = "/vehiclemovements/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        vehicleMovementService.delete(id);
        return "redirect:/vehiclemovements";
    }





}
