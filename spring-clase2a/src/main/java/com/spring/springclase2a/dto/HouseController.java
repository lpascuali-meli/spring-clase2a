package com.spring.springclase2a.dto;

import com.spring.springclase2a.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "house")
public class HouseController {
    @Autowired
    private HouseService houseService;

    @GetMapping("/area")
    public ResponseEntity getArea(@RequestBody House house) {
        return new ResponseEntity(houseService.getArea(house), HttpStatus.OK);
    }

    @GetMapping("/value")
    public ResponseEntity getValue(@RequestBody House house) {
        return new ResponseEntity(houseService.getValue(house), HttpStatus.OK);
    }

    @GetMapping("/max-room")
    public ResponseEntity getMaxRoom(@RequestBody House house) {
        return new ResponseEntity(houseService.getMaxRoom(house), HttpStatus.OK);
    }

    @GetMapping("/area-for-room")
    public ResponseEntity getAreaForRoom(@RequestBody House house) {
        return new ResponseEntity(houseService.getAreaForRoom(house), HttpStatus.OK);
    }
}
