package hackaton.EVRAZ.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bearing_warnings")
public class BearingWarnings {

    @Id
    @Column(name = "bw_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bwId;

    @Column(name = "bw_T")
    private int bwT;

    @Column(name = "bw_V")
    private int bwV;

    @Column(name = "bw_g")
    private int bwG;

    @Column(name = "bw_o")
    private int bwO;

}
