package com.allah.fridaychallenge.floor;

import com.allah.fridaychallenge.car.Car;
import com.allah.fridaychallenge.generic.ExtendedEntity;
import com.allah.fridaychallenge.parkingspace.ParkingSpace;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@Table(name = "Floor")
public class Floor extends ExtendedEntity {

    @Column(name = "floor_nr")
    private int floor_nr;

    @Column(name = "parking_space_id")
    private int parking_space_id;

    private HashMap<ParkingSpace, Car> parkings;

    public int getFloor_nr() {
        return floor_nr;
    }

    public Floor(int floor_nr, int parking_space_id) {
        this.floor_nr = floor_nr;
        this.parking_space_id = parking_space_id;
    }

    public void setFloor_nr(int floor_nr) {
        this.floor_nr = floor_nr;
    }

    public int getParking_space_id() {
        return parking_space_id;
    }

    public void setParking_space_id(int parking_space_id) {
        this.parking_space_id = parking_space_id;
    }
}
