package com.example.team7CNG457webservice.service;

import com.example.team7CNG457webservice.entity.Phone;
import com.example.team7CNG457webservice.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {
    @Autowired
    PhoneRepository phoneRepository;

    /*public String savePhone(Phone phone){ //Writes the data to Phone table
        phoneRepository.save(phone);   //Write phone to phone table
        phone.setProduct(phone.getProduct());

        return "saved";
    }*/


    public Phone savePhone(Phone phone){ //Writes the data to Phone table
        return phoneRepository.save(phone);   //Write phone to phone table

    }

    public Phone getPhone(int id){ //Gets the data with given id from Phone table

        return phoneRepository.findById(id).orElse(null);
    }

    public List<Phone> getAllPhones(){
        return  phoneRepository.findAll();
    }

    public List<Phone> getPhonesByBrand(String brand){
        return phoneRepository.getPhonesByBrand(brand);
    }

}
