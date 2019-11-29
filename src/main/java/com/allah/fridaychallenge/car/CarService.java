package com.allah.fridaychallenge.car;


public interface CarService {

    Car findCarWithNumPlate(String numberPlate);

    Car createCar(Car car);

    Car deleteCar(String numberPlate);

}
