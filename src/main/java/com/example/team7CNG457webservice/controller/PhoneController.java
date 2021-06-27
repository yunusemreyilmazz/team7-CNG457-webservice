package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.entity.Phone;
import com.example.team7CNG457webservice.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * This is a controller for Phone Controller.
 */
@RestController
public class PhoneController {

    @Autowired
    PhoneService phoneService;

    /**
     * Postmapping for creating new Phone in the Database.
     * And initializing our URL as "/addPhone".
     * Then specifying our method savePhone.
     * In the method, @RequestBody declares the body of the request that means and consider as Phone object.
     * @param c is Phone type object that we want to add to our database.
     * @return calling "savePhone" method from phoneService class to save new Phone object in the database.
     */
    @PostMapping("/addPhone")
    public Phone savePhone(@RequestBody Phone c){
        return phoneService.savePhone(c);
    }


    /**
     * Getmapping for reading elements from Database.
     * And initializing our URL as "/getphone/{id}" which want {id} to search for.
     * @param id - is searching criteria for Phone
     * @return calling "getPhone" method from phoneService class to return a Phone object from database.
     */
    @GetMapping("/getphone/{id}")
    public Phone getPhone(@PathVariable int id){ //Here we are wanting PathVariable {id}

        return phoneService.getPhone(id);
    }


    /**
     * @return - it returns a List of Phone objects that means we are getting all phones from database.
     */
    @GetMapping("/getallphones")
    public List<Phone> getAllPhones(){
        return phoneService.getAllPhones();
    }


    /**
     * @param brand - is a key word for searching in Phone table.
     * @return - it returns a list of phones with given brand keyword. Means this getmapping returns all the phones with the given brand keyword from database.
     */
    @GetMapping("/getallphonesbrand/{brand}")
    public List<Phone> getPhonesByBrand(@PathVariable String brand){
        return phoneService.getPhonesByBrand(brand);
    }


}
