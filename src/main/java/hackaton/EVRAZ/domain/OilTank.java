package hackaton.EVRAZ.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "oil_tank")
@RequiredArgsConstructor
public class OilTank {

    @Id @Column(name = "oil_tank_id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oilTankId;

    @Column(name = "oil_tank_level")
    private float oilLevel;
}
