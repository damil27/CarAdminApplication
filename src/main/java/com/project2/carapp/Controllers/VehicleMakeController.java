package com.project2.carapp.Controllers;

import com.project2.carapp.Models.JobTitle;
import com.project2.carapp.Models.VehicleMake;
import com.project2.carapp.Services.JobTitleService;
import com.project2.carapp.Services.VehicleMakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleMakeController {

    @Autowired
    private VehicleMakeService vehicleMakeService;


    //return the list
    @GetMapping("/vehiclemakes")
    public String showVehicleMake(Model model){
        List<VehicleMake> vehicleMakeList = vehicleMakeService.getVehicleMake() ;
        model.addAttribute("vehiclemakes", vehicleMakeList);

        return "vehiclemake";
    }
    // save the details
    @PostMapping("/vehiclemakes/addNew")
    public String addVehicle( VehicleMake vehicleMake ){
        vehicleMakeService.saveVehicleMake(vehicleMake);
        return "redirect:/vehiclemakes";
    }

    // get by id
    @RequestMapping("vehiclemakes/vehiclemakeById")
    @ResponseBody
    public Optional<VehicleMake> showVehicleMakeById(int id){
        return  vehicleMakeService.vehicleMakeById(id) ;
    }
    // update by id
    @RequestMapping( value="vehiclemakes/update", method = { RequestMethod.PUT, RequestMethod.GET })
    public String updateVehicleMake( VehicleMake vehicleMake ){
        vehicleMakeService.saveVehicleMake(vehicleMake);
        return "redirect:/vehiclemakes";
    }

    // delete by id
    @RequestMapping("vehiclemakes/delete")
    public String delete(int id ){
        vehicleMakeService.delete(id);
        return "redirect:/vehiclemakes";
    }


}
