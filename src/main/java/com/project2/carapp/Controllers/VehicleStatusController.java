package com.project2.carapp.Controllers;
import com.project2.carapp.Models.VehicleStatus;
import com.project2.carapp.Services.VehicleStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleStatusController {
    @Autowired
    private VehicleStatusService vehicleStatusService;


    //return the list
    @GetMapping("/vehiclestatuses")
    public String showVehicleStatus(Model model){
        List<VehicleStatus> vehicleStatusList = vehicleStatusService.getVehicleStatus() ;
        model.addAttribute("vehicleStatusList", vehicleStatusList);

        return "vehiclestatus";
    }
    // save the details
    @PostMapping("/vehiclestatuses/addNew")
    public String addvehicleStatus( VehicleStatus vehicleStatus ){
        vehicleStatusService.saveVehicle(vehicleStatus);
        return "redirect:/vehiclestatuses";
    }

    // get by id
    @RequestMapping("vehiclestatuses/vehiclestatusById")
    @ResponseBody
    public Optional<VehicleStatus> showvehicleStatusById(int id){
        return  vehicleStatusService.vehicleStatusById(id) ;
    }
    // update by id
    @RequestMapping( value="vehiclestatuses/update", method = { RequestMethod.PUT, RequestMethod.GET })
    public String updateVehicleStatus( VehicleStatus vehicleStatus  ){
        vehicleStatusService.saveVehicle(vehicleStatus);
        return "redirect:/vehiclestatuses";
    }

    // delete by id
    @RequestMapping("vehiclestatuses/delete")
    public String delete(int id ){
        vehicleStatusService.delete(id);
        return "redirect:/vehiclestatuses";
    }



}
