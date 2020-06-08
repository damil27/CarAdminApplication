package com.project2.carapp.Services;

import com.project2.carapp.Models.Client;
import com.project2.carapp.Models.Supplier;
import com.project2.carapp.Repositories.ClientRepository;
import com.project2.carapp.Repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository ;


    public List<Supplier> getSupplier(){
        return supplierRepository.findAll();
    }

    public void saveSupplier( Supplier supplier ){
       supplierRepository.save(supplier);
    }

    public Optional<Supplier> supplierById(int id){
        return supplierRepository.findById(id);
    }


    public void delete(Integer id) {
        supplierRepository.deleteById(id);
    }

}
