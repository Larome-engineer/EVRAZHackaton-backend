package hackaton.EVRAZ.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "bearing")
@RequiredArgsConstructor
public class Bearing {
    @Id
    @Column(name = "bearing_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "bearing_name")
    private int bearingName;

    @Column(name = "b_temperature")
    private int bearingTemperature;

    @Column(name = "b_V")
    private int bV;

    @Column(name = "b_G")
    private int bG;

    @Column(name = "b_O")
    private int bO;

    @OneToOne
    @JoinColumn(name = "warnings", referencedColumnName = "bw_id")
    private BearingWarnings bearingWarnings;

}
