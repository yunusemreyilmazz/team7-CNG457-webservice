package com.example.team7CNG457webservice.service;

import com.example.team7CNG457webservice.entity.AdditionalFeatureLine;
import com.example.team7CNG457webservice.repository.AdditionalFeatureLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //A DIFFERENTTT
public class AdditionalFeatureLineService {
    @Autowired
    AdditionalFeatureLineRepository additionalFeatureLineRepository;


    public AdditionalFeatureLine saveAdditionalFeatureLine(AdditionalFeatureLine additionalFeatureLine){ //Writes the data to AdditionalFeatureLıne table
        return additionalFeatureLineRepository.save(additionalFeatureLine);
    }


}
