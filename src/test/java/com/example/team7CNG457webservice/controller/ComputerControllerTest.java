package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.Team7Cng457WebserviceApplication;
import com.example.team7CNG457webservice.entity.Computer;
import com.example.team7CNG457webservice.service.ComputerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
@SpringBootTest(classes = Team7Cng457WebserviceApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ComputerControllerTest {

    @InjectMocks
    ComputerController computerController;

    @Mock
    ComputerService computerService;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @LocalServerPort
    private int port;




    @Test
    void getComputer() {
        Computer cmp1=new Computer(78,52,"TEST1",78,98,null);
        Computer cmp2=new Computer(100,58,"TEST2",15,100,null);

        List<Computer> computers=new ArrayList<>();
        computers.add(cmp1);
        computers.add(cmp2);



        Assertions.assertEquals(98,computers.get(0).getStorageCapacity());
        Assertions.assertEquals("TEST2",computers.get(1).getProcessor());
        Assertions.assertEquals(78,computers.get(0).getMemory());
        Assertions.assertEquals(15,computers.get(1).getMemory());
        Assertions.assertEquals(100,computers.get(1).getStorageCapacity());
        Assertions.assertEquals("TEST1",computers.get(0).getProcessor());


    }

    @Test
    void getAllComputers() {
        Computer cmp1=new Computer(78,52,"TEST1",78,98,null);
        Computer cmp2=new Computer(100,58,"TEST2",15,100,null);

        List<Computer> computers=new ArrayList<>();
        computers.add(cmp1);
        computers.add(cmp2);

        when(computerController.getAllComputers()).thenReturn(new ArrayList(computers));

        List<Computer> computerList= computerController.getAllComputers();

        Assertions.assertEquals(computers.size(),computerList.size());

    }
}