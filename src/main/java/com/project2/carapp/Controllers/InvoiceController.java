package com.project2.carapp.Controllers;

import com.project2.carapp.Models.*;
import com.project2.carapp.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class InvoiceController {
    @Autowired
    private  InvoiceService invoiceService ;
    @Autowired
    private  ClientService clientService ;
    @Autowired
    private InvoiceStatusService invoiceStatusService ;

    @GetMapping("/invoices")
    public String showInvoice(Model model){
        List<Invoice> invoiceList =invoiceService.getInvoice();
        model.addAttribute("invoices", invoiceList);

        List<Client> clientList = clientService.getClient();
        model.addAttribute("clients", clientList);

        List<InvoiceStatus> invoiceStatusList = invoiceStatusService.getInvoicestatus();
        model.addAttribute("invoicestatuses", invoiceStatusList);

        return "invoice";
    }

    @PostMapping("/invoices/addNew")
    public  String addInvoice(Invoice invoice){
        invoiceService.saveInvoice(invoice);
        return "redirect:/invoices";
    }

    @RequestMapping("invoices/invoiceById")
    @ResponseBody
    public Optional<Invoice> showInvoiceById(int id){
        return invoiceService.getinvoiceById(id);
    }

    @RequestMapping(value = "/invoices/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Invoice invoice ){
        invoiceService.saveInvoice(invoice);
        return "redirect:/invoices";
    }

    @RequestMapping(value = "/invoices/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
    public String delete(Integer id){
        invoiceService.delete(id);
        return "redirect:/invoices";
    }






}
