package pl.olokos.ingtestserver.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import pl.olokos.ingtestserver.model.VehicleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.olokos.ingtestserver.services.VehicleService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class VehiclesController {

    @Autowired
    private final VehicleService vehicleService;

    @GetMapping("/vehicles")
    public List<VehicleEntity> GetVehicles() {
        return vehicleService.findAllVehicles();

    }
}