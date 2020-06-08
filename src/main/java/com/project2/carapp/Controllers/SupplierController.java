package com.project2.carapp.Controllers;

import com.project2.carapp.Models.Client;
import com.project2.carapp.Models.Country;
import com.project2.carapp.Models.State;
import com.project2.carapp.Models.Supplier;
import com.project2.carapp.Services.ClientService;
import com.project2.carapp.Services.CountryService;
import com.project2.carapp.Services.StateService;
import com.project2.carapp.Services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class SupplierController {




    @Autowired
    private CountryService countryService;
    @Autowired
    private StateService stateService;
    @Autowired
    private SupplierService supplierService;


    @GetMapping("/suppliers")
    public String showSupplier(Model model){

        List<Country> countryList = countryService.getCountry();
        model.addAttribute("countries", countryList);


        List<State> stateList = stateService.getState();
        model.addAttribute("states", stateList);

        List<Supplier> supplierList = supplierService.getSupplier();
        model.addAttribute("suppliers", supplierList);



        return "supplier";
    }

    @PostMapping("/suppliers/addNew")
    public  String addSupplier(Supplier supplier){
        supplierService.saveSupplier(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping("suppliers/supplierById")
    @ResponseBody
    public Optional<Supplier> showSupplierById(int id){
        return supplierService.supplierById(id);
    }

    @RequestMapping(value = "/suppliers/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(  Supplier supplier ){
        supplierService.saveSupplier( supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping(value = "/suppliers/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        supplierService.delete(id);
        return "redirect:/suppliers";
    }




}
