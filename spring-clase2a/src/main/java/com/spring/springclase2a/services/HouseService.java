package com.spring.springclase2a.services;

import com.spring.springclase2a.dto.House;
import com.spring.springclase2a.dto.Room;
import org.springframework.stereotype.Service;

@Service
public class HouseService {
    public double getArea(House house) {
        double area = 0;
        for (Room room: house.getRooms()) {
            area += room.getArea();
        }
        return area;
    }

    public double getValue(House house) {
        return this.getArea(house) * 800;
    }

    public Room getMaxRoom(House house) {
        Room maxRoom = new Room();
        Double maxArea = 0.0;
        for (Room room: house.getRooms()) {
            if (room.getArea() > maxArea) {
                maxArea = room.getArea();
                maxRoom = room;
            }
        }
        return maxRoom;
    }

    public Room[] getAreaForRoom(House house) {
        return house.getRooms();
    }
}
