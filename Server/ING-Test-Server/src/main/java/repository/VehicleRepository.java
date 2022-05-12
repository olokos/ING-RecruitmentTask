package repository;

import model.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {
    List<VehicleEntity> findAllVehicles();

    List<VehicleEntity> findByNumberPlateContaining(String numberPlate);
}
