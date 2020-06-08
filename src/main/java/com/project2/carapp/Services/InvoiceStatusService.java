package com.project2.carapp.Services;


import com.project2.carapp.Models.InvoiceStatus;
import com.project2.carapp.Repositories.InvoiceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {
    @Autowired
    private  InvoiceStatusRepository invoiceStatusRepository;


    public List<InvoiceStatus> getInvoicestatus(){
        return invoiceStatusRepository.findAll();
    }

    public void saveInvoiceStatus(InvoiceStatus invoiceStatus ){
        invoiceStatusRepository.save(invoiceStatus);
    }

    public Optional<InvoiceStatus> invoiceStatusById(int id){
        return invoiceStatusRepository.findById(id);
    }


    public void delete(Integer id) {
        invoiceStatusRepository.deleteById(id);
    }

}
