package com.allah.fridaychallenge.car;

import com.allah.fridaychallenge.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends ExtendedEntity {

    @Column
    private String numberPlate;

    @Column
    private String brand;

    @Column
    private String model;

    public Car(String numberPlate, String brand, String model) {
        this.numberPlate = numberPlate;
        this.brand = brand;
        this.model = model;
    }
}
