package com.project2.carapp.Controllers;

import com.project2.carapp.Models.JobTitle;
import com.project2.carapp.Models.VehicleModel;
import com.project2.carapp.Services.JobTitleService;
import com.project2.carapp.Services.VehicleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleModelController {


    @Autowired
    private VehicleModelService vehicleModelService;

    //return the list
    @GetMapping("/vehiclemodels")
    public String showVehicleModel(Model model){
        List<VehicleModel> vehicleModelList = vehicleModelService.getVehicleModel() ;
        model.addAttribute("vehicleModelList", vehicleModelList );

        return "vehiclemodel";
    }
    // save the details
    @PostMapping("/vehiclemodels/addNew")
    public String addVehicleModel( VehicleModel vehicleModel ){
        vehicleModelService.savevehicleModel(vehicleModel);
        return "redirect:/vehiclemodels";
    }

    // get by id
    @RequestMapping("vehiclemodels/vehicleModelById")
    @ResponseBody
    public Optional<VehicleModel> showVehicleModelById(int id){
        return  vehicleModelService.vehicleModelById(id) ;
    }
    // update by id
    @RequestMapping( value="vehiclemodels/update", method = { RequestMethod.PUT, RequestMethod.GET })
    public String updateVehicleModel( VehicleModel vehicleModel ){
        vehicleModelService.savevehicleModel(vehicleModel);
        return "redirect:/vehiclemodels";
    }

    // delete by id
    @RequestMapping("vehiclemodels/delete")
    public String delete(int id ){
        vehicleModelService.delete(id);
        return "redirect:/vehiclemodels";
    }






}
