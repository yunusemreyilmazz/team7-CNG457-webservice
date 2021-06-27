package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.Team7Cng457WebserviceApplication;
import com.example.team7CNG457webservice.entity.Phone;
import com.example.team7CNG457webservice.service.PhoneService;
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
class PhoneControllerTest {

    @InjectMocks
    PhoneController phoneController;

    @Mock
    PhoneService phoneService;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @LocalServerPort
    private int port;





    @Test
    void getAllPhones() {
        Phone phn1=new Phone(45,45,null);
        Phone phn2=new Phone(4,750,null);

        List<Phone> phones=new ArrayList<>();
        phones.add(phn1);
        phones.add(phn2);

        when(phoneController.getAllPhones()).thenReturn(new ArrayList(phones));

        List<Phone> phoneList= phoneController.getAllPhones();

        Assertions.assertEquals(phones.size(),phoneList.size());
    }


    @Test
    void getPhones(){
        Phone phn1=new Phone(90,45,null);
        Phone phn2=new Phone(4,750,null);

        List<Phone> phones=new ArrayList<>();
        phones.add(phn1);
        phones.add(phn2);


        Assertions.assertEquals(45,phones.get(0).getInternalMemory());
        Assertions.assertEquals(4,phones.get(1).getPhoneID());
        Assertions.assertEquals(90,phones.get(0).getPhoneID());
        Assertions.assertEquals(750,phones.get(1).getInternalMemory());

    }



}