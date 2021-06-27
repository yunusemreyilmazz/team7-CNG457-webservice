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


    @Lock(LockModeType.PESSIMISTIC_READ)
    public Phone savePhone(Phone p){
        return phoneRepository.save(p);
    }

    @Lock(LockModeType.PESSIMISTIC_READ)
    public Phone getPhone(int id){
        return phoneRepository.findById(id).orElse(null);
    }


    @Lock(LockModeType.PESSIMISTIC_READ)
    public List<Phone> getAllPhones(){
        return  phoneRepository.findAll();
    }

    @Lock(LockModeType.PESSIMISTIC_READ)
    public List<Phone> getPhonesByBrand(String brand){
        return phoneRepository.getPhonesByBrand(brand);
    }

}
