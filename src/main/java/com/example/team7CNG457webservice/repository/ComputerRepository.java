package com.example.team7CNG457webservice.repository;


import com.example.team7CNG457webservice.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.LockModeType;
import java.util.List;

public interface ComputerRepository extends JpaRepository <Computer, Integer> {


    @Query(value = "SELECT c.* from Computers c, Products pr where pr.productid=c.product_productid and pr.brand=?1",nativeQuery = true)
    public List<Computer> getComputersByBrand(String brand);



}
