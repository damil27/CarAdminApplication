package com.project2.carapp.Controllers;


import com.project2.carapp.Models.Country;
import com.project2.carapp.Models.State;
import com.project2.carapp.Services.CountryService;
import com.project2.carapp.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {
    @Autowired
    private StateService stateService ;
    @Autowired
    private CountryService countryService;

    @GetMapping("/states")
    public String showState(Model model){
        List<State> stateList = stateService.getState();
        model.addAttribute("states", stateList);

        List<Country> countryList = countryService.getCountry();
        model.addAttribute("countries", countryList);
        return "state";
    }

    @PostMapping("/states/addNew")
    public  String addCountry(State state){
        stateService.saveState(state);
        return "redirect:/states";
    }

    @RequestMapping("states/stateId")
    @ResponseBody
    public Optional<State> showStateById(int id){
        return stateService.stateById(id);
    }

@RequestMapping(value = "states/update", method = {RequestMethod.GET, RequestMethod.PUT })
public String update(State state ){
        stateService.saveState(state);
        return "redirect:/states";
    }

    @RequestMapping(value = "/states/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        stateService.delete(id);
        return "redirect:/states";
    }






}
