package com.example.team7CNG457webservice.service;

import com.example.team7CNG457webservice.entity.Computer;
import com.example.team7CNG457webservice.entity.Phone;
import com.example.team7CNG457webservice.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {
    @Autowired
    ComputerRepository computerRepository;

    public Computer saveComputer(Computer computer){ //Writes the data to Computer table
        return computerRepository.save(computer);
    }

    public Computer getComputer(int id){ //Gets the data with given id from Computer table
        return computerRepository.findById(id).orElse(null);
    }

    public List<Computer> getAllComputers(){
        return  computerRepository.findAll();
    }

    public List<Computer> getComputersByBrand(String brand){
        return computerRepository.getComputersByBrand(brand);
    }
}
