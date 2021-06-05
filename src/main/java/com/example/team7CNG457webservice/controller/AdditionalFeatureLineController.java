package com.example.team7CNG457webservice.controller;

import com.example.team7CNG457webservice.entity.AdditionalFeatureLine;
import com.example.team7CNG457webservice.service.AdditionalFeatureLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionalFeatureLineController {
    @Autowired
    AdditionalFeatureLineService additionalFeatureLineService;

    @PostMapping("/addadditionalfeatureline")
    public AdditionalFeatureLine saveAdditionalFeatureLine(@RequestBody AdditionalFeatureLine additionalFeatureLine){
        return additionalFeatureLineService.saveAdditionalFeatureLine(additionalFeatureLine);
    }
}
