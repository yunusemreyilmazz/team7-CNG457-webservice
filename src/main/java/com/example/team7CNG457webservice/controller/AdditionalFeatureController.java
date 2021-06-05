package com.example.team7CNG457webservice.controller;

import com.example.team7CNG457webservice.entity.AdditionalFeature;
import com.example.team7CNG457webservice.service.AdditionalFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdditionalFeatureController {
    @Autowired
    AdditionalFeatureService additionalFeatureService;

    @PostMapping("/addadditionalfeature")
    public AdditionalFeature saveAdditionalFeature(@RequestBody AdditionalFeature additionalFeature){
        return additionalFeatureService.saveAdditionalFeature(additionalFeature);
    }

    @GetMapping("/getadditionalfeature/{id}")
    public AdditionalFeature getAdditionalFeature(@PathVariable int id){
        return additionalFeatureService.getAdditionalFeature(id);
    }
}
