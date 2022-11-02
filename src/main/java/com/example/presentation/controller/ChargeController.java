package com.example.presentation.controller;

import com.example.application.dto.ChargeRequest;
import com.example.application.service.ChargeApplicationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class ChargeController {
    private final ChargeApplicationService chargeApplicationService;

    public ChargeController(ChargeApplicationService chargeApplicationService) {
        this.chargeApplicationService = chargeApplicationService;
    }

    //todo change to restful api
    @PostMapping("/charge")
    @ResponseStatus(CREATED)
    public void charge(@RequestBody ChargeRequest chargeRequest) {
        this.chargeApplicationService.charge(chargeRequest);
    }

}
