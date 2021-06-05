package com.example.team7CNG457webservice.controller;

import com.example.team7CNG457webservice.entity.Computer;
import com.example.team7CNG457webservice.entity.Phone;
import com.example.team7CNG457webservice.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComputerController {
    @Autowired
    ComputerService computerService;

    @PostMapping("/addcomputer")
    public Computer saveComputer(@RequestBody Computer computer){
        return computerService.saveComputer(computer);
    }

    @GetMapping("/getcomputer/{id}")
    public Computer getComputer(@PathVariable int id){ //Here we are wanting PathVariable {id}
        return computerService.getComputer(id);
    }


    @GetMapping("/getallcomputers")
    public List<Computer> getAllComputers(){
        return computerService.getAllComputers();
    }

    @GetMapping("/getallcomputersbrand/{brand}")
    public List<Computer> getComputersByBrand(@PathVariable String brand){
        return computerService.getComputersByBrand(brand);
    }
}
