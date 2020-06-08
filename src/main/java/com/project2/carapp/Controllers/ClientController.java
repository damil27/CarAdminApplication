package com.project2.carapp.Controllers;

import com.project2.carapp.Models.Client;
import com.project2.carapp.Models.Country;
import com.project2.carapp.Models.EmployeeType;
import com.project2.carapp.Models.State;
import com.project2.carapp.Services.ClientService;
import com.project2.carapp.Services.CountryService;
import com.project2.carapp.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientController {


    @Autowired
    private CountryService countryService;
    @Autowired
    private StateService stateService;
    @Autowired
    private ClientService clientService;


    @GetMapping("/clients")
    public String showClient(Model model){

        List<Country> countryList = countryService.getCountry();
        model.addAttribute("countries", countryList);


        List<State> stateList = stateService.getState();
        model.addAttribute("states", stateList);

        List<Client> clientList = clientService.getClient();
        model.addAttribute("clients", clientList);



        return "client";
    }

    @PostMapping("/clients/addNew")
    public  String addClient(Client client){
       clientService.saveClient(client);
        return "redirect:/clients";
    }

    @RequestMapping("clients/clientById")
    @ResponseBody
    public Optional<Client> showClientById(int id){
        return clientService.clientById(id);
    }

    @RequestMapping(value = "/clients/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update( Client client ){
        clientService.saveClient(client);
        return "redirect:/clients";
    }

    @RequestMapping(value = "/clients/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        clientService.delete(id);
        return "redirect:/clients";
    }




}
