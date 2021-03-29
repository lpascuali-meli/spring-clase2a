package com.spring.springedades.controllers;

import com.spring.springedades.services.AgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("age")
public class AgeController {
    @Autowired
    private AgeService ageService;
    @GetMapping("/calculate/{day}/{month}/{year}")
    public ResponseEntity getAge(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        return ageService.getAge(day, month, year);
    }
}
