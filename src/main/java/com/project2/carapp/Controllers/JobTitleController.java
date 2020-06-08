package com.project2.carapp.Controllers;

import com.project2.carapp.Models.Country;
import com.project2.carapp.Models.JobTitle;
import com.project2.carapp.Models.Location;
import com.project2.carapp.Models.State;
import com.project2.carapp.Services.JobTitleService;
import com.project2.carapp.Services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class JobTitleController {

    @Autowired
    private JobTitleService jobTitleService;


    //return the list
    @GetMapping("/jobtitles")
    public String showLocation(Model model){
        List<JobTitle> JobTitleList = jobTitleService.getJobTitle() ;
        model.addAttribute("jobtitles", JobTitleList);

        return "jobtitle";
    }
    // save the details
    @PostMapping("/jobtitles/addNew")
    public String addLocation( JobTitle jobTitle){
        jobTitleService.saveJobTitle(jobTitle);
        return "redirect:/jobtitles";
    }

    // get by id
    @RequestMapping("jobtitles/jobtitleById")
    @ResponseBody
    public Optional<JobTitle> showLocationById(int id){
        return  jobTitleService.jobTitleById(id) ;
    }
    // update by id
    @RequestMapping( value="jobtitles/update", method = { RequestMethod.PUT, RequestMethod.GET })
    public String updateLocation( JobTitle jobTitle){
        jobTitleService.saveJobTitle(jobTitle);
        return "redirect:/jobtitles";
    }

    // delete by id
    @RequestMapping("jobtitles/delete")
    public String delete(int id ){
        jobTitleService.delete(id);
        return "redirect:/jobtitles";
    }









}
