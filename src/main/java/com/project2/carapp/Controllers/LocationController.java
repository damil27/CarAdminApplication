package com.project2.carapp.Controllers;

import com.project2.carapp.Models.Country;
import com.project2.carapp.Models.Location;
import com.project2.carapp.Models.State;
import com.project2.carapp.Services.CountryService;
import com.project2.carapp.Services.LocationService;
import com.project2.carapp.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    @Autowired private StateService stateService;
    @Autowired private CountryService countryService;
    @Autowired private LocationService locationService;


    //return the list
    @GetMapping("/locations")
    public String showLocation(Model model){
        List<State> stateList = stateService.getState();
        model.addAttribute("states", stateList);

        List<Country> countryList = countryService.getCountry();
        model.addAttribute("countries", countryList);

        List<Location> locationList = locationService.getLocattion();
        model.addAttribute("locations", locationList);
        return "location";
    }
    // save the details
    @PostMapping("/locations/addNew")
    public String addLocation(Location location){
        locationService.saveLocation(location);
        return "redirect:/locations";
    }

    // get by id
    @RequestMapping("locations/locationById")
    @ResponseBody
    public Optional<Location> showLocationById(int id){
      return   locationService.locationById(id);
    }
        // update by id
    @RequestMapping( value="locations/update", method = { RequestMethod.PUT, RequestMethod.GET })
    public String updateLocation( Location location){
        locationService.saveLocation(location);
        return "redirect:/locations";
    }

    // delete by id
    @RequestMapping("locations/delete")
    public String delete(int id ){
        locationService.delete(id);
        return "redirect:/locations";
    }














}
