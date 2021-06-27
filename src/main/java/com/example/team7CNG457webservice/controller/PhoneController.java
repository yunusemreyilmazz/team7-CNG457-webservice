package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.entity.Phone;
import com.example.team7CNG457webservice.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhoneController {

    @Autowired
    PhoneService phoneService;

    @PostMapping("/addPhone")
    public Phone savePhone(@RequestBody Phone c){
        return phoneService.savePhone(c);
    }

    @GetMapping("/getphone/{id}")
    public Phone getPhone(@PathVariable int id){ //Here we are wanting PathVariable {id}

        return phoneService.getPhone(id);
    }

    @GetMapping("/getallphones")
    public List<Phone> getAllPhones(){
        return phoneService.getAllPhones();
    }

    @GetMapping("/getallphonesbrand/{brand}")
    public List<Phone> getPhonesByBrand(@PathVariable String brand){
        return phoneService.getPhonesByBrand(brand);
    }


}
