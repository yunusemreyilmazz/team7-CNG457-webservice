package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.entity.AdditionalFeatures;
import com.example.team7CNG457webservice.service.AdditionalFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * This is a controller for AdditionalFeature
 */
@RestController
public class AdditionalFeatureController {
    @Autowired
    AdditionalFeatureService additionalFeatureService;

    /**
     * Postmapping for creating new additionalFeature in the Database.
     * And initializing our URL as "/addadditionalfeature".
     * Then specifying our method saveAdditionalFeature.
     * In the method, @RequestBody declares the body of the request that means and consider as  additionalFeature object.
     * @param c is AdditionalFeatures type object that we want to add to our database.
     * @return calling "saveAdditionalFeature" method from additionalFeatureService class to save new object in the database.
     */
    @PostMapping("/addAdditionalFeature")
    public AdditionalFeatures saveAdditionalFeatures(@RequestBody AdditionalFeatures c){
        return additionalFeatureService.saveAdditionalFeatures(c);
    }



    /**
     * Getmapping for reading elements from Database.
     * And initializing our URL as "/getadditionalfeature/{id}" which want {id} to search for .
     * @param id specified id which will be searched in the database
     * @return calling "getAdditionalFeatures" method from additionalFeatureService class to return a object from database.
     */
    @GetMapping("/getadditionalfeature/{id}")
    public AdditionalFeatures getAdditionalFeatures(@PathVariable int id ){
        return additionalFeatureService.getAdditionalFeatures(id);
    }

}
