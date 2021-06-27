package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.entity.Computer;
import com.example.team7CNG457webservice.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This is a controller for ComputerController.
 */
@RestController
public class ComputerController {
    @Autowired
    ComputerService computerService;


    /**
     * Postmapping for creating new Computer in the Database.
     * And initializing our URL as "/addComputer".
     * Then specifying our method saveComputer.
     * In the method, @RequestBody declares the body of the request that means and consider as  Computer object.
     * @param c is Computer type object that we want to add to our database.
     * @return calling "saveComputer" method from computerService class to save new Computer object in the database.
     */
    @PostMapping("/addComputer")
    public Computer saveComputer(@RequestBody Computer c){
        return computerService.saveComputer(c);
    }


    /**
     * Getmapping for reading elements from Database.
     * And initializing our URL as "/getcomputer/{id}" which want {id} to search for.
     * @param id - is searching value for computer
     * @return calling "getComputer" method from computerService class to return a computer object from database.
     */
    @GetMapping("/getcomputer/{id}")
    public Computer getComputer(@PathVariable int id){ //Here we are wanting PathVariable {id}
        return computerService.getComputer(id);
    }


    /**
     * @return - it returns a List of Computer objects that means we are getting all computers from database.
     */
    @GetMapping("/getallcomputers")
    public List<Computer> getAllComputers(){
        return computerService.getAllComputers();
    }


    /**
     * @param brand - is a key word for searching in computer table
     * @return - it returns a list of computer with given brand keyword. Means this getmapping returns all the computers with the given brand keyword.
     */
    @GetMapping("/getallcomputersbrand/{brand}")
    public List<Computer> getComputersByBrand(@PathVariable String brand){
        return computerService.getComputersByBrand(brand);
    }
}
