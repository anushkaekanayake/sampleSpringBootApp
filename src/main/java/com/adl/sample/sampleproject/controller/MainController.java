package com.adl.sample.sampleproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public ResponseEntity<?> sampleAPI() {
        return new ResponseEntity<>("Response", HttpStatus.OK);
    }
}