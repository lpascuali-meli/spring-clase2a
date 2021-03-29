package com.spring.springedades.services;

import com.spring.springedades.utils.FechaUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Service
public class AgeService {
    public ResponseEntity getAge(int day, int month, int year) {
        if (!FechaUtils.isValid(day, month, year)) {
            return new ResponseEntity("Fecha incorrecta", HttpStatus.BAD_REQUEST);
        }
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = String.valueOf((day > 10 ? day : ("0" + day)) + "/"
                                    + (month > 10 ? month : "0" + month) + "/" + year);
        LocalDate bornDate = LocalDate.parse(date, fmt);
        LocalDate now = LocalDate.now();

        Period period = Period.between(bornDate, now);
        String message = "Tu edad es: " + period.getYears() + " años, " + period.getMonths() + " meses y " + period.getDays() + " días";
        return new ResponseEntity(message, HttpStatus.OK);
    }
}
