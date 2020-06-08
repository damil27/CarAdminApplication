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
public class VehicleMaintenenceController {



    @Autowired
    private VehicleMaintenanceService vehicleMaintenanceService;
    @Autowired
    private  SupplierService supplierService;
    @Autowired
    private VehicleService vehicleService;


    @GetMapping("/vehiclemaintenences")
    public String showSupplier(Model model){

        List<VehicleMaintenance> vehicleMaintenanceList = vehicleMaintenanceService.getVehicleMain();
        model.addAttribute("vehicleMaintenences", vehicleMaintenanceList);


        List<Supplier> supplierList = supplierService.getSupplier();
        model.addAttribute("suppliers", supplierList);

        List<Vehicle> vehicleList = vehicleService.getVehicle();
        model.addAttribute("vehicles", vehicleList);



        return "vehiclemaintenence";
    }

    @PostMapping("/vehiclemaintenances/addNew")
    public  String addVehicleM(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceService.saveVehicleMain(vehicleMaintenance);
        return "redirect:/vehiclemaintenences";
    }

    @RequestMapping("vehiclemaintenences/vehicleMainById")
    @ResponseBody
    public Optional<VehicleMaintenance> showVehicleMainById(int id){
        return vehicleMaintenanceService.vehicleMainById(id);
    }

    @RequestMapping(value = "/vehiclemaintenences/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update( VehicleMaintenance vehicleMaintenance ){
        vehicleMaintenanceService.saveVehicleMain( vehicleMaintenance);
        return "redirect:/vehiclemaintenences";
    }

    @RequestMapping(value = "/vehiclemaintenences/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        vehicleMaintenanceService.delete(id);
        return "redirect:/vehiclemaintenences";
    }



}
