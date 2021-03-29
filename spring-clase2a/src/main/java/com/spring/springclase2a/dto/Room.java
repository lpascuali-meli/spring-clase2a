package com.spring.springclase2a.dto;

import lombok.Data;

@Data
public class Room {
    private String name;
    private Double height;
    private Double width;

    public Double getArea() {
        return this.height * this.width;
    }
}
