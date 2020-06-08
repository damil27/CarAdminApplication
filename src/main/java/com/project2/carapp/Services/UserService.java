package com.project2.carapp.Services;

import com.project2.carapp.Models.User;
import com.project2.carapp.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserRepository userRepository;
    @Autowired private BCryptPasswordEncoder encoder;

    public List<User> getUser(){
        return userRepository.findAll();
    }

    public void saveUser( User user){
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public Optional<User> userByid(int id){
        return userRepository.findById(id);
    }

    public void delete(int id){
        userRepository.deleteById(id);
    }

}
