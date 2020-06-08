package com.project2.carapp.Services;

import com.project2.carapp.Models.Client;
import com.project2.carapp.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;


    public List<Client> getClient(){
        return clientRepository.findAll();
    }

    public void saveClient(Client client ){
        clientRepository.save(client);
    }

    public Optional<Client> clientById(int id){
        return clientRepository.findById(id);
    }


    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }



}
