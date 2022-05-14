package pl.olokos.ingtestserver.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import pl.olokos.ingtestserver.model.VehicleEntity;
import pl.olokos.ingtestserver.repository.VehicleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public List<VehicleEntity> findAllVehicles() {
        Iterable<VehicleEntity> vehicleIterable = vehicleRepository.findAll();
        List<VehicleEntity> vehicleList = new ArrayList<>();
        vehicleIterable.forEach(vehicleList::add);
        return vehicleList;
    }

    public List<VehicleEntity> findByNumberPlate(String numberPlate) {
        Iterable<VehicleEntity> vehicleIterable = vehicleRepository.findByNumberPlateContaining(numberPlate);
        List<VehicleEntity> vehicleList = new ArrayList<>();
        vehicleIterable.forEach(vehicleList::add);
        if (!vehicleList.isEmpty()) {
            return vehicleList;
        } else {
            try {
                throw new NotFoundException("No vehicle with the numberPlate " + numberPlate + " was found");
            } catch (NotFoundException e) {
                e.printStackTrace();
                //eventually make it so that info appears in GUI
            }
        }
        return null;
    }
}
