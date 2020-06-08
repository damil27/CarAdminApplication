package com.project2.carapp.Controllers;




import com.project2.carapp.Models.VehicleType;

import com.project2.carapp.Services.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleTypeController {

    @Autowired
    private VehicleTypeService vehicleTypeService;


    //return the list
    @GetMapping("/vehicletypes")
    public String showVehicleType(Model model){
        List<VehicleType> vehicleTypeList = vehicleTypeService.getVehicleType() ;
        model.addAttribute("vehicleTypeList", vehicleTypeList);

        return "vehicletype";
    }
    // save the details
    @PostMapping("/vehicleTypes/addNew")
    public String addEmployeeTypes( VehicleType vehicleType ){
        vehicleTypeService.saveVehicleType(vehicleType);
        return "redirect:/vehicletypes";
    }

    // get by id
    @RequestMapping("/vehicletypes/vehicleTypeById")
    @ResponseBody
    public Optional<VehicleType> showVehicleTypeById(int id){
        return  vehicleTypeService.vehicleTypeById(id) ;
    }
    // update by id
    @RequestMapping( value="/vehicleTypes/update", method = { RequestMethod.PUT, RequestMethod.GET })
    public String updateVehicleType( VehicleType vehicleType){
        vehicleTypeService.saveVehicleType(vehicleType);
        return "redirect:/vehicletypes";
    }

    // delete by id
    @RequestMapping("/vehicletypes/delete")
    public String delete(int id ){
        vehicleTypeService.delete(id);
        return "redirect:/vehicletypes";
    }





}
