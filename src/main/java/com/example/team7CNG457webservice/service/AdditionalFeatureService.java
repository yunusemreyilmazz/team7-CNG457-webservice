package com.example.team7CNG457webservice.service;

import com.example.team7CNG457webservice.entity.AdditionalFeature;
import com.example.team7CNG457webservice.repository.AdditionalFeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdditionalFeatureService {
    @Autowired
    AdditionalFeatureRepository additionalFeatureRepository;

    public AdditionalFeature saveAdditionalFeature(AdditionalFeature additionalFeature){ //Writes the data to AdditionalFeature table
        return additionalFeatureRepository.save(additionalFeature);
    }

    public AdditionalFeature getAdditionalFeature(int id){ //Gets the data with given id from AdditionalFeature table
        return additionalFeatureRepository.findById(id).orElse(null);
    }

}
