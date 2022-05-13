package pl.olokos.ingtestserver.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.olokos.ingtestserver.model.VehicleEntity;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {
    List<VehicleEntity> findAll();

    List<VehicleEntity> findByNumberPlateContaining(String numberPlate);
}
