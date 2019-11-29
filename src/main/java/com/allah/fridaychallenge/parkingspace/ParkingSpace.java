package com.allah.fridaychallenge.parkingspace;


import com.allah.fridaychallenge.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parking_space")
public class ParkingSpace extends ExtendedEntity {

    @Column(name = "parking_nr")
    private int parkingNumber;

}
