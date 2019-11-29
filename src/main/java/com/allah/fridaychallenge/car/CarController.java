package com.allah.fridaychallenge.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{numberPlate}")
    public ResponseEntity<Car> findCarWithNumPlate(@PathVariable String numberPlate){
        Car car = carService.findCarWithNumPlate(numberPlate);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        Car newCar = carService.createCar(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }

    @DeleteMapping("/{numberPlate}")
    public ResponseEntity<Car> deleteCar(@PathVariable String numberPlate){
        Car deletedCar = carService.deleteCar(numberPlate);
        return new ResponseEntity<>(deletedCar, HttpStatus.NO_CONTENT);
    }


}
