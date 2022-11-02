package com.example.base;

import com.example.application.service.ChargeApplicationService;
import com.example.presentation.controller.ChargeController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;


@SpringBootTest
public abstract class ContractBaseClass {

    @Autowired
    ChargeController chargeController;

    @MockBean
    private ChargeApplicationService chargeApplicationService;

    @BeforeEach
    public void setup() {
        doNothing().when(chargeApplicationService).charge(any());
        RestAssuredMockMvc.standaloneSetup(chargeController);
    }

}
