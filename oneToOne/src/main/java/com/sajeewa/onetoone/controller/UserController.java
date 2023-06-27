package com.sajeewa.onetoone.controller;

import com.sajeewa.onetoone.Entity.User;
import com.sajeewa.onetoone.dto.UserDTO;
import com.sajeewa.onetoone.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/save")
    public User saveUser(@RequestBody UserDTO userDTO) {
        return userRepo.save(modelMapper.map(userDTO, User.class));

    }
@GetMapping("/getAllUsers")
    public List<User> getAllUses() {
    return userRepo.findAll();
    }

    @DeleteMapping("/delete/{uid}")
    public void deleteUser(@PathVariable long uid){
        userRepo.deleteById(uid);
    }

}
