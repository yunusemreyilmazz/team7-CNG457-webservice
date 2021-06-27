package com.example.team7CNG457webservice.service;



import com.example.team7CNG457webservice.entity.Computer;
import com.example.team7CNG457webservice.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Service;

import javax.persistence.LockModeType;
import java.util.List;

@Service
public class ComputerService {
    @Autowired
    ComputerRepository computerRepository;

    @Lock(LockModeType.PESSIMISTIC_READ)
    public Computer saveComputer(Computer c){
        return computerRepository.save(c);
    }


    @Lock(LockModeType.PESSIMISTIC_READ)
    public Computer getComputer(int id){
        return computerRepository.findById(id).orElse(null);
    }

    @Lock(LockModeType.PESSIMISTIC_READ)
    public List<Computer> getAllComputers(){
        return  computerRepository.findAll();
    }

    @Lock(LockModeType.PESSIMISTIC_READ)
    public List<Computer> getComputersByBrand(String brand){
        return computerRepository.getComputersByBrand(brand);
    }



}
