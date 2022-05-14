package pl.olokos.ingtestserver.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.olokos.ingtestserver.model.VehicleEntity;
import pl.olokos.ingtestserver.services.VehicleService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class VehiclesController {
    private final VehicleService vehicleService;

    @GetMapping("/vehicles")
    public List<VehicleEntity> GetVehicles() {

        return vehicleService.findAllVehicles();

    }
}