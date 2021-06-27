package com.example.team7CNG457webservice.service;


import com.example.team7CNG457webservice.entity.Phone;
import com.example.team7CNG457webservice.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Service;

import javax.persistence.LockModeType;
import java.util.List;

@Service
public class PhoneService {

    @Autowired
    PhoneRepository phoneRepository;



    public Phone savePhone(Phone p){
        return phoneRepository.save(p);
    }


    public Phone getPhone(int id){
        return phoneRepository.findById(id).orElse(null);
    }



    public List<Phone> getAllPhones(){
        return  phoneRepository.findAll();
    }


    public List<Phone> getPhonesByBrand(String brand){
        return phoneRepository.getPhonesByBrand(brand);
    }

}
