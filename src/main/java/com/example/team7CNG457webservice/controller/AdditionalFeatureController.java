package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.entity.AdditionalFeatures;
import com.example.team7CNG457webservice.service.AdditionalFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdditionalFeatureController {
    @Autowired
    AdditionalFeatureService additionalFeatureService;


    @PostMapping("/addAdditionalFeature")
    public AdditionalFeatures saveAdditionalFeatures(@RequestBody AdditionalFeatures c){
        return additionalFeatureService.saveAdditionalFeatures(c);
    }


    @GetMapping("/getadditionalfeature/{id}")
    public AdditionalFeatures getAdditionalFeatures(@PathVariable int id ){
        return additionalFeatureService.getAdditionalFeatures(id);
    }

}
