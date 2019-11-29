package com.allah.fridaychallenge;

public class Parking_Lot {
    private String id;
    private Integer name;
    private Integer floors;

    public Parking_Lot(String id, Integer name, Integer floors) {
        this.id = id;
        this.name = name;
        this.floors = floors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }
}
