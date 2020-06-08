package com.project2.carapp.Controllers;


import com.project2.carapp.Models.Country;
import com.project2.carapp.Services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryCountroller {
    @Autowired
    private CountryService countryService;
    @GetMapping("/countries")
    public String showcountries(Model model){
        List<Country> countryList = countryService.getCountry();
        model.addAttribute("countries", countryList);
        return "country";
    }

    @PostMapping("/countries/addNew")
    public  String addCountry(Country country){
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping("countries/countryId")
    @ResponseBody
    public Optional<Country> showCountryById(int id){
        return countryService.countryById(id);
    }

    @RequestMapping(value = "/countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Country country ){
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        countryService.delete(id);
        return "redirect:/countries";
    }






    }
