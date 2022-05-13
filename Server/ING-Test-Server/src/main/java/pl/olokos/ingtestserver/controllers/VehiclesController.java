package pl.olokos.ingtestserver.controllers;

import lombok.RequiredArgsConstructor;
import pl.olokos.ingtestserver.model.VehicleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.olokos.ingtestserver.services.VehicleService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class VehiclesController {

    @Autowired
    private final VehicleService vehicleService;

    @RequestMapping("/vehicles")
    public List<VehicleEntity> GetVehicles() {
        return vehicleService.findAllVehicles();

    }
}