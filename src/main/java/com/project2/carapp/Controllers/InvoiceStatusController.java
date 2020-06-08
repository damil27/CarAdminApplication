package com.project2.carapp.Controllers;

import com.project2.carapp.Models.Country;
import com.project2.carapp.Models.InvoiceStatus;
import com.project2.carapp.Models.JobTitle;
import com.project2.carapp.Repositories.InvoiceStatusRepository;
import com.project2.carapp.Services.CountryService;
import com.project2.carapp.Services.InvoiceStatusService;
import com.project2.carapp.Services.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class InvoiceStatusController {
    @Autowired
    private  InvoiceStatusService invoiceStatusService ;

    @GetMapping("/invoicestatuses")
    public String showInvoiceStatus(Model model){
        List<InvoiceStatus> invoiceStatusListList = invoiceStatusService.getInvoicestatus();
        model.addAttribute("invoiceStatusListList", invoiceStatusListList);
        return "invoiceStatus";
    }

    @PostMapping("/invoicestatuses/addNew")
    public  String addInvoiceStatus( InvoiceStatus invoiceStatus){
      invoiceStatusService.saveInvoiceStatus(invoiceStatus);
        return "redirect:/invoicestatuses";
    }

    @RequestMapping("invoicestatuses/invoiceStatusById")
    @ResponseBody
    public Optional<InvoiceStatus> showInvoiceStatusById(int id){
        return invoiceStatusService.invoiceStatusById(id);
    }

    @RequestMapping(value = "/invoicestatuses/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(InvoiceStatus invoiceStatus ){
        invoiceStatusService.saveInvoiceStatus(invoiceStatus);
        return "redirect:/invoicestatuses";
    }

    @RequestMapping(value = "/invoicestatuses/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        invoiceStatusService.delete(id);
        return "redirect:/invoicestatuses";
    }




}
