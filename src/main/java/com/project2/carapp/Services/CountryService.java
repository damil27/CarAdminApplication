package com.project2.carapp.Services;

import com.project2.carapp.Models.Country;
import com.project2.carapp.Repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;


    public List<Country> getCountry(){
        return countryRepository.findAll();
    }

    public void saveCountry(Country country){
        countryRepository.save(country);
    }

    public Optional<Country> countryById(int id){
        return countryRepository.findById(id);
    }


    public void delete(Integer id) {
        countryRepository.deleteById(id);
    }
}
