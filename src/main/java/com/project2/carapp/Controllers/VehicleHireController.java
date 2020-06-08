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
public class VehicleHireController {
    @Autowired
    private VehicleHireService vehicleHireService;
    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private ClientService clientService;

    @GetMapping("/vehiclehires")
    public String showVehicleMovement(Model model){
        List<VehicleHire> vehicleMoveList = vehicleHireService.getVehicleHire();
        model.addAttribute("vehicleHires", vehicleMoveList);

        List<Vehicle> vehicleList = vehicleService.getVehicle();
        model.addAttribute("vehicles", vehicleList);

        List<Location> locationList = locationService.getLocattion();
        model.addAttribute("locations", locationList);


        List<Client> clientList = clientService.getClient();
        model.addAttribute("clients", clientList);

        return "vehiclehire";
    }

    @PostMapping("/vehiclehires/addNew")
    public  String addVehicleHire(VehicleHire vehicleHire){
        vehicleHireService.saveVehicleHire(vehicleHire);
        return "redirect:/vehiclehires";
    }

    @RequestMapping("vehiclehires/hireById")
    @ResponseBody
    public Optional<VehicleHire> vehicleHireById(int id){
        return vehicleHireService.vehicleHireById(id);
    }

    @RequestMapping(value = "/vehiclehires/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleHire vehicleHire ){
        vehicleHireService.saveVehicleHire(vehicleHire);
        return "redirect:/vehiclehires";
    }

    @RequestMapping(value = "/vehiclehires/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        vehicleHireService.delete(id);
        return "redirect:/vehiclehires";
    }





}
