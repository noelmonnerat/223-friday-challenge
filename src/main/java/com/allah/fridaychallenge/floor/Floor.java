package com.allah.fridaychallenge.floor;

import com.allah.fridaychallenge.generic.ExtendedEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@Table(name="Floor")
public class Floor extends ExtendedEntity {

    @Column(name="floor_nr")
    int floor_nr;

    @Column(name = "parking_space_id")
    int parkning_space_id;



}
