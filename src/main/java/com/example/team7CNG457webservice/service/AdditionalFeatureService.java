package com.example.team7CNG457webservice.service;


import com.example.team7CNG457webservice.entity.AdditionalFeatures;
import com.example.team7CNG457webservice.repository.AdditionalFeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdditionalFeatureService {

    @Autowired
    AdditionalFeatureRepository additionalFeatureRepository;

    public AdditionalFeatures saveAdditionalFeatures(AdditionalFeatures a ){
        return additionalFeatureRepository.save(a);
    }
    public AdditionalFeatures getAdditionalFeatures(int id){
        return additionalFeatureRepository.findById(id).orElse(null);
    }

}
