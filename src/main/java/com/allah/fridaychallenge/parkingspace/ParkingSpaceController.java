package com.allah.fridaychallenge.parkingspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parkingspace")
public class ParkingSpaceController {
  private ParkingSpaceService parkingSpaceService;

  @Autowired
  public ParkingSpaceController(ParkingSpaceService parkingSpaceService) {
    this.parkingSpaceService = parkingSpaceService;


  }

}
