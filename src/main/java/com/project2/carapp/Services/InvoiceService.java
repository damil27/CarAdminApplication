package com.project2.carapp.Services;


import com.project2.carapp.Models.Country;
import com.project2.carapp.Models.Invoice;
import com.project2.carapp.Repositories.CountryRepository;
import com.project2.carapp.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;


    public List<Invoice> getInvoice(){
        return invoiceRepository.findAll();
    }

    public void saveInvoice(Invoice invoice ){
        invoiceRepository.save(invoice);
    }

    public Optional<Invoice> getinvoiceById(int id){
        return invoiceRepository.findById(id);
    }


    public void delete(Integer id) {
        invoiceRepository.deleteById(id);
    }


}
