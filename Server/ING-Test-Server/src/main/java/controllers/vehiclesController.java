package controllers;

import lombok.RequiredArgsConstructor;
import model.VehicleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.VehicleRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class vehiclesController {

    @Autowired
    VehicleRepository vehicleRepository;

    @GetMapping(value = "/vehicles", produces = "application/json")
    public List<VehicleEntity> getVehicles() {
        return vehicleRepository.findAllVehicles();
    }


}
