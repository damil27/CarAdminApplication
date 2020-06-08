package com.project2.carapp.Services;

import com.project2.carapp.Models.Country;
import com.project2.carapp.Models.State;
import com.project2.carapp.Repositories.CountryRepository;
import com.project2.carapp.Repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public List<State> getState(){
        return stateRepository.findAll();
    }

    public void saveState(State state){
        stateRepository.save(state);
    }

    public Optional<State> stateById(int id){
        return stateRepository.findById(id);
    }


    public void delete(Integer id) {
        stateRepository.deleteById(id);
    }

}
