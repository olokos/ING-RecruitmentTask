package pl.olokos.ingtestserver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehicle")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vehicleId", nullable = false)
    private Long vehicleId;

    @Basic
    @Column(name = "make", nullable = false, length = 250)
    private String make;

    @Basic
    @Column(name = "model", nullable = false, length = 250)
    private String model;

    @Basic
    @Column(name = "numberPlate", nullable = false, length = 8)
    private String numberPlate;

    @Basic
    @Column(name = "purchasedFor", nullable = false)
    private BigDecimal purchasedFor;

    @Basic
    @Column(name = "vehicleType", nullable = true)
    private VehicleTypeEnum vehicleTypeEnum;

//    @OneToOne(mappedBy = "vehicle")
//    @ToString.Exclude
//    @PrimaryKeyJoinColumn
// //    @NotFound(action = NotFoundAction.IGNORE)
// //    @EqualsAndHashCode.Exclude

//    private WhitelistEntryEntity whitelistedVehicle;
//
//    @OneToMany(mappedBy = "vehicle", cascade = {CascadeType.REMOVE})
//    private Set<TrafficOffenseEntity> allOffensesForVehicle;

}



