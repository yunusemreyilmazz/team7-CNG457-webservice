package com.example.team7CNG457webservice.repository;

import com.example.team7CNG457webservice.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone,Integer> {
    @Query(value = "SELECT p.* from Phones p, Products pr where pr.productid=p.product_productid and pr.brand=?1",nativeQuery = true)
    public List<Phone> getPhonesByBrand(String brand);

}
