package com.spring.springclase2a.dto;

import lombok.Data;

@Data
public class House {
    private String name;
    private String address;
    private Room[] rooms;
}
